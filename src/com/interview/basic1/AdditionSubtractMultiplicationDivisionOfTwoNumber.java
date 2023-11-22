package com.interview.basic1;

import java.util.Scanner;

public class AdditionSubtractMultiplicationDivisionOfTwoNumber {

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		int add = getAddition(x,y);
		System.out.println("Addition of two number is : "+add);
		
		int sub = getSubtarction(x, y);
		System.out.println("Substraction of two number is : "+sub);
		
		int mul = getMultiplication(x, y);
		System.out.println("Multiplication of two number is : "+mul);
		
		int division = getDivision(x, y);
		System.out.println("Division of two number is : "+division);
		
		int mod = getModulus(x, y);
		System.out.println("Modulus of two number is : "+mod);

	}
	
	public static int getAddition(int x,int y) {
		int z= x+y;
		return z;
	}
	
	public static int getSubtarction(int x,int y) {
		int z= x-y;
		return z;
	}
	
	public static int getMultiplication(int x,int y) {
		int z= x*y;
		return z;
	}
	
	public static int getDivision(int x,int y) {
		int z= x/y;
		return z;
	}
	
	public static int getModulus(int x,int y) {
		int z= x/y;
		return z;
	}

}
