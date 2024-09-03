package com.web.service;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")

public class UserService {

     UserDao userDao = new UserDao();

     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public String sayPlainTextHello() {
          return "Users Details!";
     }

     @GET
     @Path("/users")
     @Produces(MediaType.APPLICATION_XML)
     public List<User> getUsers() {
          return userDao.getAllUsers();
     }

}
