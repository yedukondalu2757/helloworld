/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.web.service;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 7hills
 */
@Entity
@Table(name = "job")
@XmlRootElement
@NamedQueries({
     @NamedQuery(name = "Job.findAll", query = "SELECT j FROM Job j")
     , @NamedQuery(name = "Job.findByJobId", query = "SELECT j FROM Job j WHERE j.jobId = :jobId")
     , @NamedQuery(name = "Job.findByJobTitle", query = "SELECT j FROM Job j WHERE j.jobTitle = :jobTitle")
     , @NamedQuery(name = "Job.findByJobLocation", query = "SELECT j FROM Job j WHERE j.jobLocation = :jobLocation")
     , @NamedQuery(name = "Job.findByPrimarySkills", query = "SELECT j FROM Job j WHERE j.primarySkills = :primarySkills")
     , @NamedQuery(name = "Job.findByExperienceLevel", query = "SELECT j FROM Job j WHERE j.experienceLevel = :experienceLevel")
     , @NamedQuery(name = "Job.findByPostedDate", query = "SELECT j FROM Job j WHERE j.postedDate = :postedDate")
     , @NamedQuery(name = "Job.findByCurrentStatus", query = "SELECT j FROM Job j WHERE j.currentStatus = :currentStatus")})
public class Job implements Serializable {

     private static final long serialVersionUID = 1L;
     @Id
     @Basic(optional = false)
     @NotNull
     @Size(min = 1, max = 255)
     @Column(name = "job_id")
     private String jobId;
     @Size(max = 255)
     @Column(name = "job_title")
     private String jobTitle;
     @Size(max = 255)
     @Column(name = "job_location")
     private String jobLocation;
     @Size(max = 255)
     @Column(name = "primary_skills")
     private String primarySkills;
     @Size(max = 255)
     @Column(name = "experience_level")
     private String experienceLevel;
     @Column(name = "posted_date")
     @Temporal(TemporalType.DATE)
     private Date postedDate;
     @Size(max = 255)
     @Column(name = "current_status")
     private String currentStatus;
     @Lob
     @Size(max = 65535)
     @Column(name = "description")
     private String description;

     public Job() {
     }

     public Job(String jobId) {
          this.jobId = jobId;
     }

     public String getJobId() {
          return jobId;
     }

     public void setJobId(String jobId) {
          this.jobId = jobId;
     }

     public String getJobTitle() {
          return jobTitle;
     }

     public void setJobTitle(String jobTitle) {
          this.jobTitle = jobTitle;
     }

     public String getJobLocation() {
          return jobLocation;
     }

     public void setJobLocation(String jobLocation) {
          this.jobLocation = jobLocation;
     }

     public String getPrimarySkills() {
          return primarySkills;
     }

     public void setPrimarySkills(String primarySkills) {
          this.primarySkills = primarySkills;
     }

     public String getExperienceLevel() {
          return experienceLevel;
     }

     public void setExperienceLevel(String experienceLevel) {
          this.experienceLevel = experienceLevel;
     }

     public Date getPostedDate() {
          return postedDate;
     }

     public void setPostedDate(Date postedDate) {
          this.postedDate = postedDate;
     }

     public String getCurrentStatus() {
          return currentStatus;
     }

     public void setCurrentStatus(String currentStatus) {
          this.currentStatus = currentStatus;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     @Override
     public int hashCode() {
          int hash = 0;
          hash += (jobId != null ? jobId.hashCode() : 0);
          return hash;
     }

     @Override
     public boolean equals(Object object) {
          // TODO: Warning - this method won't work in the case the id fields are not set
          if (!(object instanceof Job)) {
               return false;
          }
          Job other = (Job) object;
          if ((this.jobId == null && other.jobId != null) || (this.jobId != null && !this.jobId.equals(other.jobId))) {
               return false;
          }
          return true;
     }

     @Override
     public String toString() {
          return "com.web.service.Job[ jobId=" + jobId + " ]";
     }
     
}
