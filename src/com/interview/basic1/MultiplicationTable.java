package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program that takes a number as input and prints its multiplication table up to 10. 
 **/
public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		getTable(x);
		//Solve the expression
		Double y =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(y);
	}
	
	public static void getTable(int x) {
		System.out.println("Multiplication Table is");
		for(int i=1;i<=10;i++) {		
			System.out.println(x*i);
		}	
	}
}
