package com.interview.basic1;

import java.util.Scanner;
/**
 * Write a Java program to print 'Hello' on screen and your name on a separate line. 
 **/
public class Hello {

	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		sayHello(string);

	}
	
	public static void sayHello(String str) {
		System.out.println("Hello ");
		System.out.println(str);
	}

}
