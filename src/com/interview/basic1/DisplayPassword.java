package com.interview.basic1;

import java.util.Scanner;

/**
 *  Write a Java program to input and display your password.
 **/
public class DisplayPassword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Password");
        String password = sc.next();
        System.out.println("Password is : "+password);
	}
}
