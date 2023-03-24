package com.datastorage;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DataStorage {
	public static SessionFactory factory;
	  public static SessionFactory getFactory() {
		  
		  if(factory == null) {
			  factory = new Configuration().configure("ehealth.cfg.xml").buildSessionFactory();
		     }
	      return factory;
	  }
	  public void closeFactory()
	  {
		  if(factory.isOpen())
		  {
			  factory.close();
		  }
	  }
}
