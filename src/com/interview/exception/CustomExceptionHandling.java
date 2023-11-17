package com.interview.exception;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {
		
		System.out.println("Enter Age of student");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		Age age = new Age();
		age.setAge(value);
			
		try {
			if (age.getAge()<18) {
				throw new Age();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}       
	}
}
