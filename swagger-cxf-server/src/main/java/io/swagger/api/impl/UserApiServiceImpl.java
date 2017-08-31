package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.User;

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
import java.util.ArrayList;

public class UserApiServiceImpl implements UserApi {
    public User createUser(User body) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<User> getUserByQuery(String name, String email, String referenceDate) {
    	System.out.println("getUserByQuery");
    	ArrayList al = new	ArrayList <User>();
    	// TODO: Implement...
        User u = new User();
        
        u.setId("1");
        u.email("francisco.prata@gmail.com");
        u.firstName("Francisco");
        u.lastName("Prata");
        u.setUsername("fprata");
        al.add(u);
        return al;
    }
    
    public User getUserByid(String id) {
        // TODO: Implement...
        
        return null;
    }
    
    public void updateUser(String id, User body) {
        // TODO: Implement...
        
        
    }
    
}

