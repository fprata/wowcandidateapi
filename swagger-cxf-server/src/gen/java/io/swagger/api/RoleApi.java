package io.swagger.api;

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
public interface RoleApi  {

    @POST
    @Path("/roles")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Create role", tags={ "role",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation") })
    public void createRole(@Valid Role body);

    @GET
    @Path("/roles")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "manage roles", tags={ "role",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Role.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Invalid role supplied"),
        @ApiResponse(code = 404, message = "Role not found") })
    public List<Role> getRoles(@QueryParam("application") String application);

    @GET
    @Path("/roles/{id}")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "manage roles", tags={ "role",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Role.class),
        @ApiResponse(code = 400, message = "Invalid role supplied"),
        @ApiResponse(code = 404, message = "Role not found") })
    public Role getRolesbyID(@PathParam("id") Integer id);

    @PUT
    @Path("/roles/{id}")
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Updated role", tags={ "role" })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid id supplied"),
        @ApiResponse(code = 404, message = "User not found") })
    public void updateRole(@PathParam("id") Integer id, @Valid Role body);
}

