package com.interview.string;

import java.util.Scanner;

public class CulculateNumberOfCharactorInString {

	public static void main(String[] args) {

		System.out.println("Enter String ");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		//String string ="abc abc abc";
        int count=countString(string);
		System.out.println("Total No. Charactor "+count);

	}

	public static int countString(String string) {
		int count=0;

		for(int i=0;i<string.length();i++) {
			if (string.charAt(i)!=' ') {
				count++;
			}          
		}
		return count;
	}
}
