package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a circle. 
 **/
public class AreaAndPerimeterOfCircle {

	public static void main(String[] args) {
		System.out.println("Enter Radius Of Circle");
		Scanner sc = new Scanner(System.in);
		float r = sc.nextFloat();
		
		areaOfCircle(r);
		perimeterOfCircle(r);
		
	}

	public static void areaOfCircle(float r) {
	   double area = 3.14*(r*r);
       System.out.println("Area of Circle is : "+area);
	}

	public static void perimeterOfCircle(float r) {
		double perimeter = 2*3.14*(r);
		System.out.println("Perimeter of circle is : "+perimeter);
	}

}
