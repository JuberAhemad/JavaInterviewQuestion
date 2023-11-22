package com.interview.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *Write a Java program that reads a file and throws an exception if the file is empty. 
 **/
public class FileIsEmptyExceptionApp {

	public static void main(String[] args) {
		String path="G://IO/employe.txt";
		//checkFile(path);
		readFile(path);
	}

	public static void checkFile(String path) {
		Employee employee = new Employee();


		try {
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);
			System.out.println("Employee Object is serialized");
			oos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {

		}
	}

	public static void readFile(String path) {
		try {
			File file = new File(path);
			if (file.exists()) {

				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Employee emp =(Employee) ois.readObject();
				if (emp==null) {
					throw new Exception("File Is Empty");
				}else {
					System.out.println(emp.getName());
				}
				
			}else {
				System.out.println("File is not available");
              throw new FileNotFoundException();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
