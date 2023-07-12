package com.example.shiva;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Students")
public class Student {

	private int stdId;
	private String firstName;
	private String lastName;
	private Date dob;
	private String fatherName;
	private String motherName;
	private String address;
	private String city;
	private int phoneNo;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stdId, String firstName, String lastName, Date dob, String fatherName, String motherName,
			String address, String city, int phoneNo) {
		super();
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
		this.city = city;
		this.phoneNo = phoneNo;
	}
	@Id
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	
}
