package com.interview.basic1;
/**
 * Write a Java program to swap two variables. 
 **/
public class SwapTwoVariable {

	public static void main(String[] args) {
		
		int x=20;
		int y=10;
		
		System.out.println("Orginal number x : "+x +" and y is : "+y);
		
		x=x-y;
		y=x+y;
		
		System.out.println("Swap  number x : "+x +" and y is : "+y);
	}
}
