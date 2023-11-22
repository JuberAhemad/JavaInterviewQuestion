package com.interview.basic1;

import java.util.Scanner;

/**
 *  Write a Java program that takes three numbers as input to
 *  calculate and print the average of the numbers. 
 **/
public class AverageOfThreeNumber {

	public static void main(String[] args) {

		System.out.println("Enter First Number ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		System.out.println("Enter Second Number ");
		Scanner sc1 = new Scanner(System.in);
		int y = sc.nextInt();
		
		System.out.println("Enter Third Number ");
		Scanner sc2 = new Scanner(System.in);
		int z = sc.nextInt();
		
		float average = getAverage(x, y, z);
		System.out.println("Average of Three Number is : "+average);
	}
	
	public static float getAverage(int x,int y,int z) {
		float avg = (x+y+z)/2;
		return avg;
	}

}
