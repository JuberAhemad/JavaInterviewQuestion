package com.interview.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CreatingObjectByDeserialization {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Juber Ahemad");
		emp.setEmail("juber@gmail.com");
		
		String path ="G://IO/emp.txt";
		try {
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Employee Object Is Serialized");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		//Creating Object By Deserilization
		
		try {
			File f = new File(path);
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee employee = (Employee)ois.readObject();
			System.out.println(employee.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
