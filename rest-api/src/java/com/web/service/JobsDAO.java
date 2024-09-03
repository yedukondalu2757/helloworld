package com.web.service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class JobsDAO {

     EntityManager entitymanager;

     public JobsDAO() {
          entitymanager = EMUtil.getEM();
     }

     public void addJobs(Job newJob) {
          try {
               entitymanager.getTransaction().begin();
          } catch (Exception e) {
               System.out.print("Transaction already begin");
          }
          entitymanager.merge(newJob);
          try {
               entitymanager.getTransaction().commit();
          } catch (Exception e) {
               System.out.print("Transaction already commit");
          }
     }

     public void deleteJobs(String jobId) {
          try {
               entitymanager.getTransaction().begin();
          } catch (Exception e) {
               System.out.print("Transaction already begin");
          }
          Job job = new Job();
          job.setJobId(jobId);
          job = (Job) entitymanager.find(Job.class, jobId);
          entitymanager.remove(job);
          try {
               entitymanager.getTransaction().commit();
          } catch (Exception e) {
               System.out.print("Transaction already commit");
          }
     }

     public Job getJobs(String jobId) {
          try {
               entitymanager.getTransaction().begin();
          } catch (Exception e) {
               System.out.print("Transaction already begin");
          }
          Job job = new Job();
          job.setJobId(jobId);
          job = (Job) entitymanager.find(Job.class, jobId);
          return job;
     }

     public List<Job> getJobs() {
          try {
               entitymanager.getTransaction().begin();
          } catch (Exception e) {
               System.out.print("Transaction already begin");
          }
          List<Job> jobs = null;
          Query query = entitymanager.createQuery("select j from Job j");
          jobs = query.getResultList();
          return jobs;
     }

     public void updateJobs(String jobId, Job updatedJobs) {
          try {
               entitymanager.getTransaction().begin();
          } catch (Exception e) {
               System.out.print("Transaction already begin");
          }
          Job job = new Job();
          job.setJobId(jobId);
          job = (Job) entitymanager.find(Job.class, jobId);
          job.setJobTitle(updatedJobs.getJobTitle());
          job.setExperienceLevel(updatedJobs.getExperienceLevel());
          job.setPrimarySkills(updatedJobs.getPrimarySkills());
          job.setPostedDate(updatedJobs.getPostedDate());
          job.setCurrentStatus(updatedJobs.getCurrentStatus());
          job.setDescription(updatedJobs.getDescription());
          entitymanager.merge(job);
          try {
               entitymanager.getTransaction().commit();
          } catch (Exception e) {
               System.out.print("Transaction already commit");
          }
     }
}
