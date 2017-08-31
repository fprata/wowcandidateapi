package io.swagger.api;

import java.util.List;
import io.swagger.model.Role;

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
public interface UserRoleApi  {

    @DELETE
    @Path("/users/{id}/roles/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Remove roles from user", tags={ "user_role",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void deleteRoleUser(@PathParam("id") String id, @Valid List<Role> body);

    @GET
    @Path("/users/{id}/roles/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "manage user role assignments", tags={ "user_role",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Role.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid role supplied"),
        @ApiResponse(code = 404, message = "Role not found") })
    public List<Role> getUserRoles(@PathParam("id") Integer id);

    @POST
    @Path("/users/{id}/roles/")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Assign roles to user", tags={ "user_role" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Role.class),
        @ApiResponse(code = 200, message = "successful operation") })
    public Role updateRoleUser(@PathParam("id") String id, @Valid List<Role> body);
}

