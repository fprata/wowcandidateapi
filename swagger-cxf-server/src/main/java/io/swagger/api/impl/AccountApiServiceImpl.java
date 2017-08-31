package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Account;
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

public class AccountApiServiceImpl implements AccountApi {
    public Account getAccountID(String id) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<Account> getAccountUpdates(String referencedate) {
        // TODO: Implement...
        
        return null;
    }
    
    public List<User> getAccountsForAccountID(String id, Boolean shipto) {
        // TODO: Implement...
        
        return null;
    }
    
}

