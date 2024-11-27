package com.springhibernate.demo;



import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class StudentDetails {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int stuid;
	
	@Column(length =50,name="STREET")
 private String street;
	
	@Column(length=100,name="CITY")
 private String city;
	
	@Column(name="is_open")
 private boolean isOpen;
	
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
 private Date addedDate;
	
	@Lob
 private byte[]image;

	public int getStuid() {
		return stuid;
	}

	public void setStuid(int stuid) {
		this.stuid = stuid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Student_Details [stuid=" + stuid + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	 

}
