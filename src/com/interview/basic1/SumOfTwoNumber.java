package com.interview.basic1;

import java.util.Scanner;

/**
 *Write a Java program to print the sum of two numbers. 
 **/
public class SumOfTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		int addition = sum(x,y);
		System.out.println("Sum of two number is : "+addition);
	}
	
	public static int sum(int x,int y) {
		int z =x+y;
		return z;
	}
}
