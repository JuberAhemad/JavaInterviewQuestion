package com.interview.exception;

import java.util.Scanner;

/**
 * Write a Java program to create a method that takes an integer as a
 * parameter and throws an exception if the number is odd. 
 **/
public class ExceptionApp {
	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		getInput(value);
	}

	public static void getInput(int x){
		try {
			checkOddNumber(x);
			 System.out.println(x + " is even.");
		} catch (IllegalArgumentException e) {
			 System.out.println("Error: " + e.getMessage());
		}	
	}
	
	public static void checkOddNumber(int number) {
		if (number%2!=0) {
			throw new IllegalArgumentException(number + " is odd.");
		}	
	}
}
