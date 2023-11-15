package com.interview.string;

public class SplitString {

	public static void main(String[] args) {
		String str ="Java is, programing, language";
		//String[] split = str.split(" ");
        String[] split = str.split(",");
         for(int i=0;i<split.length;i++) {
        	 System.out.println(split[i]);
         }
	}

}
