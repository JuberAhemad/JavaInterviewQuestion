package com.interview.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		System.out.println("Enter First String");
		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.next();
		System.out.println("Enter Second String");
		Scanner sc2 = new Scanner(System.in);
		String str2 = sc2.next();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if (str1.length()==str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			boolean result = Arrays.equals(charArray1, charArray2);
			if (result) {
				System.out.println("Both Object are Anagram");
			}else {
				System.out.println("Both Object are not Anagram");
			}
		}else {
			System.out.println("Both String is not anagram");
		}		
	}
}
