package com.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.Student;

public class HibernateConfig {

	
	public static void main(String[] args) {
		
		//create the object of configuration class
		
		Configuration cfg = new Configuration();
		
		
		
		//2.call configure method 
		cfg.configure();//it will read the hibernate.cfg.xml file
		
		//3\.call buildsessionfactory method
	    SessionFactory sf =	cfg.buildSessionFactory();//to perfrom database operations
	    
	    //insert,update,delete,get
	   Session ss= sf.openSession();///we have different methods to perform crud operations like save,update
	    
	   //5.we need to start the transaction to insert,update,delete data
	  Transaction tr= ss.beginTransaction();
	    //
	    //System.out.println("table created");
//	   Student s1= new Student();
//	   s1.setId(4);
//	   s1.setName("sai");
//	   s1.setMarks(99.67);
	  
	  Employee e1 = new Employee();
	  
	  e1.setId(2);
	  e1.setDep("Science");
	  e1.setGender("Male");
	  e1.setName("sata");
	  e1.setSalary(76000);
	  
	  Employee e2 = new Employee();
	  e2.setId(3);
	  e2.setDep("sales");
	  e2.setGender("male");
	  e2.setName("sadik");
	  e2.setSalary(670000);
	   
	   ss.save(e1);//to save the dataa in table .this is old method i.e.depercated
	   ss.save(e2);
	
	  tr.commit();//to save the data
	  
	  ss.close();//for the security
	  
	  //update,delete,Get
	
	
	}
}
