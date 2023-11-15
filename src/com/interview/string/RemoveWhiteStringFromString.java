package com.interview.string;

import java.util.Scanner;

public class RemoveWhiteStringFromString {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String string = sc.next();
		String remSpace="";
		System.out.println("Orginal String is "+string);
					
			for(int i=0;i<string.length();i++) {
				char ch = string.charAt(i);
				if (ch!=' ') {
					remSpace=remSpace+ch;
				}
			}
					
		System.out.println("Final String is "+remSpace);
	}
}
