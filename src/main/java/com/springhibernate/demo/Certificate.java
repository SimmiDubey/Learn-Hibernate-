package com.springhibernate.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Certificate {
   
	String course;
	String duration;
	
	public void setCourse(String course)
	{
		 this.course=course;
	}
	public void setDuration(String duration)
	{
		this.duration=duration;
	}
	
	public String getCourse() {
		 return course;
	}
	public String getDuration() {
		return duration;
	}
	
	public String toString() {
		return "Certificate [course=" + course + ", duration=" + duration + "]";
	}
	
}
