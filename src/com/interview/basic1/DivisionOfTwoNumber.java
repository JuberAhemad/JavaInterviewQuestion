package com.interview.basic1;

import java.util.Scanner;
/**
 * Write a Java program to divide two numbers and print them on the screen.
 **/
public class DivisionOfTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		int division = division(x,y);
		System.out.println("Division of two number is : "+division);

	}
	
	public static int division(int x, int y) {		
		int divide = x/y;
		return divide;
	}

}
