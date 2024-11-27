package onetotest.com;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MapDemo {
  public static void main(String arg[])
  {
	   Configuration cf=new Configuration();
	   cf.configure("hibernate.cfg.xml");
	   SessionFactory factory=cf.buildSessionFactory();
	   
	   
	   Question ques=new Question();
	   ques.setQuestionName("What is java");
	   
	   Answer an=new Answer();
	   an.setAnsName("Java is high level programming language");
	   ques.setAns(an);
	   
	   
	   //session
	   
	   Session s=factory.openSession();
	   Transaction tx=s.beginTransaction();
	   
	   s.save(ques);
	   s.save(an);
	   
	   
	   
	   tx.commit();
	   factory.close();
  }


}
