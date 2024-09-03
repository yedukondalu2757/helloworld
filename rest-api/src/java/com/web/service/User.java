package com.web.service;

import java.io.Serializable;  
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 
@XmlRootElement(name = "user") 

public class User implements Serializable {  
   private static final long serialVersionUID = 1L; 
   private int id; 
   private String name; 
   private String profession;  
   private String company;
   
   public User(){super();} 
    
   public User(int id, String name, String profession, String company){  
	  super();
      this.id = id; 
      this.name = name; 
      this.profession = profession; 
      this.company = company;
   }  
   public int getId() { 
      return id; 
   }  
   @XmlElement 
   public void setId(int id) { 
      this.id = id; 
   } 
   public String getName() { 
      return name; 
   } 
   @XmlElement
   public void setName(String name) { 
      this.name = name; 
   } 
   public String getProfession() { 
      return profession; 
   } 
   @XmlElement 
   public void setProfession(String profession) { 
      this.profession = profession; 
   } 
   public String getCompany() {
	  return company;
   }
   @XmlElement
   public void setCompany(String company) {
	   this.company = company;
   }
} 