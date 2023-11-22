package com.interview.exception;
/**
 * Write a Java program to create a method that takes a string as input and throws
 * an exception if the string does not contain vowels. 
 **/
public class VowelsInString {

	public static void main(String[] args) {
		
		
		String string="Hello";
		try {
			System.out.println("Checking vowels in string");
			getString(string);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Block Always execute");
		}
	}

	public static void getString(String string) throws Exception {	 
		   String str ="";
		   for(int n=0;string.length()>n;n++) {
			   char ch = str.charAt(n);
				switch (ch) {				
				case 'a': {
                    System.out.println("String contains vowels : " +ch);
				}
				case 'e': {
					 System.out.println("String contains vowels : " +ch);
				}
				case 'i': {
					 System.out.println("String contains vowels : " +ch);
				}
				case 'o': {
					 System.out.println("String contains vowels : " +ch);
				}
				case 'u': {
					 System.out.println("String contains vowels : " +ch);
				}
				default:
					throw new Exception("String Does not contains vowels : ");
				}
		   }
	}
}
