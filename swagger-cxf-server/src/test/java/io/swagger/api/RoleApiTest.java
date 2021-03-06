/**
 * VLV Admin API
 * This is the description for the VLV Admin API. This api allows for user management, role management, role to user assignment and account to user assigment
 *
 * OpenAPI spec version: 1.0.2
 * Contact: francisco.j.prata@accenture.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.api;

import io.swagger.model.Role;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * API tests for RoleApi
 */
public class RoleApiTest {


    private RoleApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("https://localhost:443/security/v1", RoleApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    
    /**
     * Create role
     *
     * Create a new role in the security API
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoleTest() {
        Role body = null;
        //api.createRole(body);
        
        // TODO: test validations
        
        
    }
    
    /**
     * manage roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesTest() {
        String application = null;
        //List<Role> response = api.getRoles(application);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * manage roles
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRolesbyIDTest() {
        Integer id = null;
        //Role response = api.getRolesbyID(id);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    
    /**
     * Updated role
     *
     * Update role info.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRoleTest() {
        Integer id = null;
        Role body = null;
        //api.updateRole(id, body);
        
        // TODO: test validations
        
        
    }
    
}
