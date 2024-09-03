package com.web.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Person {

     private int id;
     private String name;
     private String country;

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getCountry() {
          return country;
     }

     public void setCountry(String country) {
          this.country = country;
     }

     public Person(int id, String name, String country) {
          super();
          this.id = id;
          this.name = name;
          this.country = country;
     }

     public Person() {
          super();
     }
}
