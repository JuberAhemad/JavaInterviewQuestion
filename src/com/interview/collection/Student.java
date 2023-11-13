package com.interview.collection;

import java.util.Date;

public class Student implements Comparable<Student> {
	
	private String id;
	private String name;
	private String email;
	private Date dob;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, String email, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.dob = dob;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", dob=" + dob + "]";
	}
	
	
	
	@Override
	public int compareTo(Student student) {
		int id = this.id.compareTo(student.id);
		//int name = student.name.compareTo(student.name);
		return id;
	}
}
