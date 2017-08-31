package io.swagger.api;

import java.io.IOException;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import com.google.gson.JsonObject;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.model.Picklist;

@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @GET
    @Path("/picklist")
    @ApiOperation(value = "", tags={  })
    @Produces({ "application/json" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Picklist.class, responseContainer = "List") })
    public List<Picklist> picklistGet(@QueryParam("picklistid") @NotNull String picklistid);
    
    
    @GET
    @Path("/picklistsf")
    @ApiOperation(value = "", tags={  })
    @Produces({ "application/json" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Picklist.class, responseContainer = "List") })
    public List<Picklist> picklistGetSf(@QueryParam("picklistid") @NotNull String picklistid) throws IllegalStateException, IOException;
}

