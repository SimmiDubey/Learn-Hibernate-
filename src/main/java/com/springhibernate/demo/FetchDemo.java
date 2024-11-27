package com.springhibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FetchDemo {
  public static void main(String arg[])
  { 
	  Configuration cf=new Configuration();
	  cf.configure("hibernate.cfg.xml");
	  SessionFactory factory = cf.buildSessionFactory();
	  Session session=factory.openSession();
	  
	  //get student
   
        Student st=(Student)session.load(Student.class,1);
        System.out.println(st);
        
        StudentDetails student=(StudentDetails)session.get(StudentDetails.class,2);
        System.out.println(student.getStreet()+" : "+student.getCity());
        session.close();
        factory.close();
  }
}
