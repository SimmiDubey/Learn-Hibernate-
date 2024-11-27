package onetomanytest.com;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 
	 @OneToMany(mappedBy="department")
	 private List<Employee>employees;
	 
	 public void setId(int id)
	 {
		  this.id=id;
	 }
	 public void setName(String name)
	 {
		  this.name=name;
	 }
	 public void setEmployees(List<Employee>employees)
	 {
		  this.employees=employees;
	 }
	 
	 
	 public int getId() {
		  return id;
	 }
	 public String getName() {
		  return name;
	 }
	 
	 public List<Employee>getEmployees(){
		  return employees;
	 }
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", employees=" + employees + "]";
	}
	 
	 
	 
	
}
