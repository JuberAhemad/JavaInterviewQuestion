package com.interview.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Break String into token and count number By Using StringTokenizer Class 
 **/
public class StringTockenizerApp {

	public static void main(String[] args) {
		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		StringTokenizer st=new StringTokenizer(string);
		
		System.out.println("Total Number Of Token is : "+st.countTokens());
		
		while(st.hasMoreElements()) {
			String element =(String) st.nextElement();
			System.out.println("Tokens is : "+element);
		}
		
	}
}
