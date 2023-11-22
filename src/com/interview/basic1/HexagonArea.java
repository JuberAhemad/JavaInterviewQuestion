package com.interview.basic1;

import java.util.Scanner;

/**
 *Write a Java program to compute hexagon area. 
 **/
public class HexagonArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the length of a side of the hexagon: ");
		double side = sc.nextDouble();


		// Area of a hexagon = (6 * s^2)/(4*tan(π/6))

		double area = getArea(side);
		System.out.println(area);

	}

	public static double getArea(double  s) {
		double  area = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
		return area;
	}

}
