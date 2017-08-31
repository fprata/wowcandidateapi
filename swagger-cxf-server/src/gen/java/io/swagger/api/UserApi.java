package io.swagger.api;

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
public interface UserApi  {

    @POST
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "Create user", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 200, message = "successful operation") })
    public User createUser(@Valid User body);

    @GET
    @Path("/users")
    @Produces({ "application/json" })
    @ApiOperation(value = "get user info", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public List<User> getUserByQuery(@QueryParam("name") String name, @QueryParam("email") String email, @QueryParam("reference date") String referenceDate);

    @GET
    @Path("/users/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Get user by user id", tags={ "user",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public User getUserByid(@PathParam("id") String id);

    @PUT
    @Path("/users/{id}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Updated user", tags={ "user" })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public void updateUser(@PathParam("id") String id, @Valid User body);
}

