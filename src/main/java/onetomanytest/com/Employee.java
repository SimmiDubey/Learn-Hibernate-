package onetomanytest.com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToOne()
	@JoinColumn(name="department_Id")//foreign key
	private Department department;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		 this.name=name;
	}
	public void setDepartment(Department department)
	{
		 this.department=department;
	}
	
	public int getId() {
		 return id;
	}
	public String getName() {
		 return name;
		 
	}
	
	public Department getDepartment() {
		 return department;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", department=" + department + "]";
	}
	
	
	
}
