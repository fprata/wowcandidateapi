package io.swagger.api;

import io.swagger.model.Account;
import java.util.List;

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
public interface UserAccountApi  {

    @DELETE
    @Path("/users/{id}/accounts/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Delete user account assignment", tags={ "user_account",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public void deleteUserAccounts(@PathParam("id") String id, @Valid List<Account> body);

    @GET
    @Path("/users/{id}/accounts/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "manage user account assignments", tags={ "user_account",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Account.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public List<Account> getUserAccounts(@PathParam("id") Integer id);

    @POST
    @Path("/users/{id}/accounts/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Updated user / account assignment (upsert)", tags={ "user_account" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Account.class),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public Account updateUserAccounts(@PathParam("id") String id, @Valid List<Account> body);
}

