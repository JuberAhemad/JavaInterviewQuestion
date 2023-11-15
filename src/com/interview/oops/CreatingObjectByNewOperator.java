package com.interview.oops;


class Student{
	private String name = "Juber Ahemad";
	private String email = "juber.ahemad";
	
	public Student() {
		super();
		System.out.println("Creating Object");
	}
	
	public void sayGreeting(String str) {
		System.out.println(str+ " "+name);
	}
}


public class CreatingObjectByNewOperator {

	public static void main(String[] args) {
		Student student = new Student();
		student.sayGreeting("Good Evening");
	}
}
