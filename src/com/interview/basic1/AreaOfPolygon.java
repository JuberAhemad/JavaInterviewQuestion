package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program to compute the area of a polygon.
 * Area of a polygon = (n*s^2)/(4*tan(π/n)) 
 **/
public class AreaOfPolygon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter side of polygon : ");
		int side = sc.nextInt();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter length of polygon : ");
		int length = sc.nextInt();

		double area = area(length, side);
		System.out.println("Area of Polygon is : "+area);
	}

	public static double area(int n,int s) {

		double area = (n*s*s)/(4*Math.tan(Math.PI/n));

		return area;
	}
}
