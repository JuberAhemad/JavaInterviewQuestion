package com.interview.exception;
/**
 * What do you mean by ClassCastException? 
 * It is a RuntimeException that occurs when JVM is unable to cast an
 * object of one type to another type.
 **/
public class CalssCastExceptionMain {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Juber", "juber@gmail.com", 35);
		Object obj=(Object)emp;
		//String ob=(String)emp;
        System.out.println(obj);
	}

}
