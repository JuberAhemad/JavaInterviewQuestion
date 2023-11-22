package com.interview.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
/**
 *  Write a Java program to create a method that reads a file and 
 *  throws an exception if the file is not found.
 **/
public class FileNotFoundExceptionApp {

	public static void main(String[] args) {
		String path="G://IO/employee.txt";
		getFile(path);
	}

	public static void getFile(String path) {	
		try {
			File file= new File(path);
			if (file.exists()) {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois=new ObjectInputStream(fis);
				ois.readObject();
			}else {
				throw new FileNotFoundException();
			}		

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
