package onetomanytest.com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
   
	public static void main(String arg[])
	{
		 Configuration cf=new Configuration();
		 cf.configure("hibernate.cfg.xml");
		 SessionFactory factory=cf.buildSessionFactory();
		 
		 Department d=new Department();
		 d.setName("IT Department");
		 
		 Employee em=new Employee();
		 em.setName("john sinha");
		 em.setDepartment(d);
		 
		 //open session
		 
		 Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		 
		 s.save(d);
		 s.save(em);
		 
		 tx.commit();
		 factory.close();
		 
		System.out.println("Data successful by saved");
		 
		 
	}
}
