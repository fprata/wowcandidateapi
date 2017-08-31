package io.swagger.api.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.accenture.wow.util.DestinationUtil;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sap.core.connectivity.api.http.HttpDestination;

import io.swagger.api.DefaultApi;
import io.swagger.model.Picklist;
import io.swagger.model.PicklistItem;

public class DefaultApiServiceImpl implements DefaultApi {

	private static final Logger Log = LoggerFactory.getLogger(DefaultApiServiceImpl.class);

	public List<Picklist> picklistGet(String picklistid) {
		ArrayList al = null;
		ArrayList alItems = null;
		System.out.println("picklistGet");
		if (picklistid == null)
			return null;
		String[] ids = picklistid.split(",");
		al = new ArrayList<Picklist>();
		for (String s : ids) {

			alItems = new ArrayList<PicklistItem>();
			// TODO: Implement...
			Picklist pl = new Picklist();
			pl.setName("Picklist1");
			PicklistItem plItem = new PicklistItem();
			plItem.setLabel("label1");
			plItem.setPicklistId("picklistId0");
			alItems.add(plItem);
			pl.setValues(alItems);
			al.add(pl);

		}

		return al;

	}

	public List<Picklist> picklistGetSf(String picklistId) throws IllegalStateException, IOException {
		HttpResponse response = null;
		StringBuffer result = new StringBuffer();
		//JsonObject jsonObj = new JsonObject();
		StringBuffer sbPickList = new StringBuffer();
		String encodePickList = null;
		
		List<Picklist> ret = new ArrayList<Picklist> ();
		
		try {
			String[] split = picklistId.split(",");
			for (String s : split) {
				sbPickList.append("'");
				sbPickList.append(s);
				sbPickList.append("'");
				sbPickList.append(",");
			}

			String pickListIds = sbPickList.toString().substring(0, sbPickList.toString().length() - 1);
			encodePickList = "picklistOption/picklist/picklistId in " + pickListIds
					+ " and locale eq 'en_US' and picklistOption/status eq 'ACTIVE'";
			System.out.println("encodePickList : " + encodePickList);

			String destinationPath = "/PicklistLabel?$filter=" + "" + URLEncoder.encode(encodePickList, "UTF-8")
					+ "&$select="
					+ URLEncoder.encode(
							"picklistOption/picklist/picklistId,picklistOption/id,label,picklistOption/externalCode,locale",
							"UTF-8")
					+ "&$expand=" + URLEncoder.encode("picklistOption,picklistOption/picklist", "UTF-8")
					+ "&$format=json";

			HttpDestination destination = DestinationUtil.lookupDestination("SF_ODATA_Basic2");
			HttpClient destClient = destination.createHttpClient();
			HttpGet request = new HttpGet(destinationPath);
			response = destClient.execute(request);

			BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));

			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
			}
			JsonParser parser = new JsonParser();
			JsonObject jObj = (JsonObject) parser.parse(result.toString()).getAsJsonObject();
			JsonObject getObject = (JsonObject) jObj.get("d");
			JsonArray getArray = getObject.getAsJsonArray("results");

			Picklist picklist = new Picklist();
			picklist.setName("PickListValues");
			
			for (JsonElement pa : getArray) {
				JsonObject pickListObj = pa.getAsJsonObject();
				JsonObject subjObj = (JsonObject) parser.parse(pickListObj.get("picklistOption").toString())
						.getAsJsonObject();
				JsonObject pickListOptionObj = (JsonObject) parser.parse(subjObj.get("picklist").toString())
						.getAsJsonObject();

			
				
				PicklistItem picklistItem = new PicklistItem();
				picklistItem.setLabel(pickListObj.get("label").getAsString());
				picklistItem.setPicklistId(pickListOptionObj.get("picklistId").getAsString());
				picklistItem.setPicklistId(subjObj.get("id").getAsString());
				picklistItem.setExternalCode(subjObj.get("externalCode").getAsString());
				picklistItem.setLocale(pickListObj.get("locale").getAsString());
				
				picklist.addValuesItem(picklistItem);
				
			}
			

			ret.add(picklist);

		} catch (IOException e) {
			System.err.println("IOException: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		return ret;
	}

}
