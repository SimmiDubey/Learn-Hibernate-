package com.springhibernate.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student{
	
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 private String name;
	 private String city;
	 
	 
	 public void setId(int id)
	 {
		  this.id=id;
	 }
	 public void setName(String name)
	 { 
		 this.name=name;
	 }
	 public void setCity(String city)
	 {
		  this.city=city;
	 }
	 public int getId(){
		return id; 
	 }
	 public String getName(){
		  return name;
	 }
	 public String getCity() {
		  return city;
	 }
	 
	 @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}