package com.interview.basic1;

import java.util.Scanner;

/**
 * Write a Java program and compute the sum of an integer's digits. 
 **/
public class SumOfIntegerDigit {

	public static void main(String[] args) {
		System.out.println("Enter Digit ");
		Scanner sc = new Scanner(System.in);
		int integer = sc.nextInt();
		int sumDigits = sumDigits(integer);
		System.out.println(sumDigits);
	}
	
	public static int  sumDigits(int n) {
		int sum =0;
		while(n!=0) {
			
			sum += n % 10;
            n /= 10;
           // n=n/10;
		}
		
		return sum;
	}

}
