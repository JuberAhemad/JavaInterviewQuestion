package com.interview.string;

import java.util.Scanner;

/**
 * Find Duplicate Charactor's In String
 **/
public class FindDuplicateCharactorInString {

	public static void main(String[] args) {

		System.out.println("Enter String");
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();

		//Convert String into Char Array
		char[] ch = string.toCharArray();
		int count=0;

		/*
		 * for(int i=0;i<ch.length;i++) {
        	count=1;
        	for(int j=i+1;j<ch.length;j++) {
        		if(ch[i]==ch[j] && ch[i]!=' ') {
        			count++;
        			ch[j]='0';
        		}
        	}
        }       
		 **/

		//Count Each Charactor's present in String
		for(int i=0;i<string.length();i++) {
			if (string.charAt(i)!=' ') {
				count++;
			}     	
		} 
		System.out.println("Total No. of Charactor's In String : "+count);
	}
}
