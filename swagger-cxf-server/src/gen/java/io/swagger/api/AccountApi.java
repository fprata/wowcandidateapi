package io.swagger.api;

import io.swagger.model.Account;
import io.swagger.model.User;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/")
@Api(value = "/", description = "")
public interface AccountApi  {

    @GET
    @Path("/accounts/{id}")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "get account info by id", tags={ "account",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Account.class),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public Account getAccountID(@PathParam("id") String id);

    @GET
    @Path("/accounts")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "get accounts that where changed since ..", tags={ "account",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid date supplied. Format (mm/dd/yyyy)"),
        @ApiResponse(code = 404, message = "No accounts found") })
    public List<Account> getAccountUpdates(@QueryParam("referencedate") @NotNull String referencedate);

    @GET
    @Path("/accounts/{id}/accounts")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "get accounts related to account (downstream)", tags={ "account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "Account not found") })
    public List<User> getAccountsForAccountID(@PathParam("id") String id, @QueryParam("shipto") Boolean shipto);
}

