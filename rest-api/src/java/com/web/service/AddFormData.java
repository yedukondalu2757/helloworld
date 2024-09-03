package com.web.service;

import javax.ws.rs.FormParam;  
import javax.ws.rs.POST;  
import javax.ws.rs.Path;  
import javax.ws.rs.core.Response;  
@Path("/user")  
public class AddFormData{  
    @POST  
    @Path("/add")  
    public Response addUser(  
        @FormParam("id") int id,  
        @FormParam("name") String name,  
        @FormParam("country") String country) {  
   
        return Response.status(200)  
            .entity(" User added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Country: "+country)  
            .build();  
    }  
}  