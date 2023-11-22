package com.interview.basic1;

import java.io.File;

/**
 * Write a Java program to find the size of a specified file. 
 **/
public class FindSizeOfFile {

	public static void main(String[] args) {
		String path="G://IO/employee.txt";
		File file = new File(path);
		System.out.println("File size is : "+file.length()+" bytes");

	}
}
