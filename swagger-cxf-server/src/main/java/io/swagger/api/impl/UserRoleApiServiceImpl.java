package io.swagger.api.impl;

import io.swagger.api.*;
import java.util.List;
import io.swagger.model.Role;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

public class UserRoleApiServiceImpl implements UserRoleApi {
    public void deleteRoleUser(String id, List<Role> body) {
        // TODO: Implement...
        
        
    }
    
    public List<Role> getUserRoles(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    public Role updateRoleUser(String id, List<Role> body) {
        // TODO: Implement...
        
        return null;
    }
    
}

