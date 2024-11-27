package com.springhibernate.demo;





import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "projected started" );
    
    Configuration cf=new Configuration();
    cf.configure("hibernate.cfg.xml");
    SessionFactory factory=cf.buildSessionFactory();
    
    Student st = new Student();
    
    st.setName("Simmi");
    st.setCity("Prayagraj");
    System.out.println(st);
    
    
    
    StudentDetails st1=new StudentDetails();
    st1.setStuid(102);
    st1.setStreet("street1");
    st1.setCity("Delhi");
    st1.setOpen(true);
    st1.setAddedDate(new Date());
    
    System.out.println(st1);    
    
    
    //reading image
    
    FileInputStream fi=new FileInputStream("src/main/java/n.jpg");
    byte[]data=new byte[fi.available()];
    fi.read(data);
    st1.setImage(data);
     
    System.out.println(data);
    
    Session session=factory.openSession();
    
    Transaction tx=session.beginTransaction();
    session.save(st);
    session.save(st1);
    System.out.println("Done..");
    tx.commit();
    
    session.close();
    
    }
    
}
