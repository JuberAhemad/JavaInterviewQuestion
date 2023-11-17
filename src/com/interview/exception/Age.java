package com.interview.exception;

public class Age extends Exception	{
	
	private int age;
	
	public Age() {
		//System.out.println("For DL Age Must Be greater than or Equal to 18 year ");
	}
	
	public Age(String str) {
		System.out.println(str);
	}
	
	public Age(int age) {
		super();
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
}
