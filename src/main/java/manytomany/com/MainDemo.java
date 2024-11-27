package manytomany.com;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainDemo {
  
	public static void main(String arg[])
	{
		 Configuration cf=new Configuration();
		 cf.configure("hibernate.cfg.xml");
		 SessionFactory factory=cf.buildSessionFactory();
		 
		 Employe emp=new Employe();
		 Employe emp1=new Employe();
		 
		 emp.setEid(34);
		 emp.setEmpName("Shyam");
		 
		 emp1.setEid(35);
		 emp1.setEmpName("Ram");
		 
		 Project p=new Project();
		 Project p1=new Project();
		 
		 p.setPid(1213);
		 p.setProject_name("Student management");
		 
		 p1.setPid(1314);
		 p.setProject_name("Hotel Mnagement");
		 
		 List<Employe>list1=new ArrayList<Employe>();
		 List<Project>list2=new ArrayList<Project>();
		 
		 list1.add(emp);
		 list1.add(emp1);
		 
		 list2.add(p);
		 list2.add(p1);
		 
		 emp.setProjects(list2);
		 p1.setEmployees(list1);
		 
		 
		 Session session=factory.openSession();
		 Transaction tx=session.beginTransaction();
		 
		 session.save(emp);
		 session.save(emp1);
		 session.save(p);
		 session.save(p1);
		 
		 tx.commit();
		 
		 factory.close();
	}
}
