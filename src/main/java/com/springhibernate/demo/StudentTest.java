package com.springhibernate.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentTest {
    @Id
	int sid;
	String name;
	private Certificate certi;
	
	public void StudentTest(int sid,String name,Certificate certi) {
		this.sid=sid;
		this.name=name;
		this.certi=certi;
			 
	}
	
	public void setId(int sid)
	{
		 this.sid=sid;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setCerti(Certificate certi) {
		 this.certi=certi;
	}
	public int getId() {
		 return sid;
	}
	public String getName() {
		 return name;
	}
	public Certificate getCerti() {
		 return certi;
	}
	
	@Override
	public String toString() {
		return "StudentTest [sid=" + sid + ", name=" + name + ", certi=" + certi + "]";
	}
	
}
