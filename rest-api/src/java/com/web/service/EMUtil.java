package com.web.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

public class EMUtil {
	static EntityManager entitymanager = null;

    public EMUtil() throws PersistenceException {
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("gsspu");
         entitymanager = emf.createEntityManager();
    }

    public static EntityManager getEM() {
          if(entitymanager == null){
              EntityManagerFactory emf = Persistence.createEntityManagerFactory("gsspu");
              entitymanager = emf.createEntityManager();
         }
         return entitymanager;
    }

}
