package com.interview.string;

public class StringMutablity {

	public static void main(String[] args) {
		String s1 ="Java";
		String s2 ="Java";
		s1=s1.concat("Hello");
		
		if (s1==s2) {
			System.out.println("Both are pointing one object");
		} else {
           System.out.println("Both are differnt object");
		}
		
		System.out.println("-----------------------");
		
		if (s1.equals(s2)) {
			System.out.println("Both Object Are Same");
		}else {
			System.out.println("Both Object Are Not Same");
		}
	}
}
