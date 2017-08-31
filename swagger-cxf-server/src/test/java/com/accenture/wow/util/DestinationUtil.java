package com.accenture.wow.util;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.sap.core.connectivity.api.DestinationFactory;
import com.sap.core.connectivity.api.http.HttpDestination;

public class DestinationUtil {
	public static HttpDestination lookupDestination(String destinationName) throws IOException {
		try {
			Context ctx = new InitialContext();
			DestinationFactory destinationFactory = (DestinationFactory) ctx.lookup(DestinationFactory.JNDI_NAME);
			HttpDestination destination = (HttpDestination) destinationFactory.getDestination(destinationName);
			return destination;
		} catch (Exception e) {
			throw new IOException(e.getMessage(), e);
		}
	}

}
