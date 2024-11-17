package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT_DATA")
public class Student {

	@Id
	@Column(name = "STUDENT_ROLLNO")
	@GeneratedValue
	private int rollno;
	
	@Column(name = "STUDENT_NAME")
	private String name;
	
	@Column(name = "STUDENT_ADDRESS")
	private String address;
	
	@Column(name = "STUDENT_EMAIL")
	private String email;
	
	@Column(name = "STUDENT_CONTACT")
	private String contactNo;
	
	@Column(name = "STUDENT_GENDER")
	private String gender;
	
	public Student() {
		
	}

	public Student(int rollno, String name, String address, String email, String contactNo, String gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
		this.email = email;
		this.contactNo = contactNo;
		this.gender = gender;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
