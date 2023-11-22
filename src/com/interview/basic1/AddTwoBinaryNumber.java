package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program to add two binary numbers. 
 **/
public class AddTwoBinaryNumber {

	public static void main(String[] args) {
		/*
		 * System.out.println("Enter Lenght of Perimeter "); Scanner sc = new
		 * Scanner(System.in); float length = sc.nextFloat();
		 * 
		 * System.out.println("Enter Lenght of Perimeter "); Scanner sc = new
		 * Scanner(System.in); float length = sc.nextFloat();
		 */
		addBinary(10,11);
		

	}
	
	public static void addBinary(int x,int y) {
		int z= x+y;
		System.out.println(z);
	}

}
