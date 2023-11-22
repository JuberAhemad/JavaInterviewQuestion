package com.interview.basic1;
/**
 * Write a Java program to reverse a string.
 **/
public class ReverseString {

	public static void main(String[] args) {
		String string ="The quick brown fox";
		System.out.println("Orginal String is  "+string);
		String rev ="";
		
		for(int i = string.length()-1;i>=0;i--) {
			rev=rev+string.charAt(i);
		}
		
		System.out.println("Reverse String is : "+rev);

	}

}
