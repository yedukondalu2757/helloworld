package com.web.service;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jobs")
public class JobsService {

     JobsDAO jobsDAO = new JobsDAO();

     @POST
     @Path("/add")
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     public Job addJobs(Job newJobs){
          jobsDAO.addJobs(newJobs);
          return newJobs;
     }

     @GET
     @Path("/list")
     @Produces(MediaType.APPLICATION_JSON)
     public List<Job> getJobs() {
          return jobsDAO.getJobs();
     }

     @GET
     @Path("/view/{id}")
     @Produces(MediaType.APPLICATION_JSON)
     public Job getJob(@PathParam("id") String jobId) {
          return jobsDAO.getJobs(jobId);
     }

     @DELETE
     @Path("/delete/{id}")
     @Consumes(MediaType.APPLICATION_JSON)
     public void deleteJobs(@PathParam("id") String jobId) {
          jobsDAO.deleteJobs(jobId);
//          try{
//               URI uri = new URI("http://localhost:8090/WebServices/rest/jobs/list");
//               Response.temporaryRedirect(uri);
//          }catch(Exception e){
//               e.printStackTrace();
//          }
     }
     
     @PUT
     @Path("/update/{id}")
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     public Job updateJobs(@PathParam("id") String jobId, Job updateJobs) {
          jobsDAO.updateJobs(jobId, updateJobs);
          return updateJobs;
     }

}