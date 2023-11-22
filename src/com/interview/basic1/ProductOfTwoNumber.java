package com.interview.basic1;

import java.util.Scanner;
/**
 * Write a Java program that takes two numbers as input and displays the product of two numbers. 
 **/
public class ProductOfTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		int product = getProduct(x,y);
		System.out.println("Division of two number is : "+product);

	}
	
	public static int getProduct(int x, int y) {		
		int z = x*y;
		return z;
	}

}
