package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program to print the area and perimeter of a rectangle. 
 **/
public class PerimeterOfRectangle {

	public static void main(String[] args) {
		System.out.println("Enter Lenght of Perimeter ");
		Scanner sc = new Scanner(System.in);
		float length = sc.nextFloat();
		
		System.out.println("Enter Width of Perimeter ");
		Scanner sc1 = new Scanner(System.in);
		float width = sc.nextFloat();
		
		getPerimeter(length, width);

	}
	
	public static void getPerimeter(float llength, float width) {
		//Formula of rectangle Perimeters is P = (L + W) × 2
		float perimiter = (llength+width)*2;
		System.out.println("Perimeter is : "+perimiter);
	}

}
