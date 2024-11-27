package com.springhibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbDemo {
	 public static void main(String arg[])
	 {
		  
		 Configuration cf=new Configuration();
		 cf.configure("hibernate.cfg.xml");
		 SessionFactory factory=cf.buildSessionFactory();
		 
		 StudentTest st=new StudentTest();
		 st.setId(102);
		 st.setName("Surya kumar");
		 
		 Certificate cr=new Certificate();
		 cr.setCourse("MBA");
		 cr.setDuration("2 months");
		 
		 st.setCerti(cr);
		 
		 Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		 s.save(st);
		 tx.commit();
		 //s.close();
		 factory.close();
		 
	 }
	 

}
