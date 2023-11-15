package com.interview.string;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		 
		String palString="";
		for(int i=str.length()-1;i>=0;i--) {
			palString=palString+str.charAt(i);
		}
		
		if (str.equals(palString)) {
			System.out.println("String is Palindrome");
		}else {
			System.out.println("String Is not Palindrome");
		}

	}

}
