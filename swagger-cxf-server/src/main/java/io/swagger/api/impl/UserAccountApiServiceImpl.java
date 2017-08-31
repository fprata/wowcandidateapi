package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Account;
import java.util.List;

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

public class UserAccountApiServiceImpl implements UserAccountApi {
    public void deleteUserAccounts(String id, List<Account> body) {
        // TODO: Implement...
        
        
    }
    
    public List<Account> getUserAccounts(Integer id) {
        // TODO: Implement...
        
        return null;
    }
    
    public Account updateUserAccounts(String id, List<Account> body) {
        // TODO: Implement...
        
        return null;
    }
    
}

