package com.web.service;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWS {

     @GET
     @Produces(MediaType.TEXT_PLAIN)
     public String sayPlainTextHello() {
          return "Hello Yedukondalu!";
     }

     @GET
     @Path("/authors")
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     public List getTrackInJSON() {
          List listPerson = new ArrayList();
          Person p1 = new Person();
          p1.setId(1);
          p1.setName("yedukondalu");
          p1.setCountry("India");
          Person p2 = new Person();
          p2.setId(2);
          p2.setName("Ashok");
          p2.setCountry("India");
          listPerson.add(p1);
          listPerson.add(p2);
          return listPerson;
     }

     @GET
     @Path("/authors/post")
     @Produces(MediaType.APPLICATION_JSON)
     public Response setTrackInJSON(Person p1) {
          String result = "Person saved : " + p1.getId();
          return Response.status(201).entity(result).build();
     }

}
