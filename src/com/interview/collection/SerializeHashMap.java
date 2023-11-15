package com.interview.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * How To Serialize HashMap In Java With Example
 **/
public class SerializeHashMap implements Serializable{

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(2,"juber");
		map.put(5,"iqra");
		map.put(8,"ayeza");
		map.put(3,"atif");
		map.put(9,"anam");
		map.put(4,"fayeza");
		map.put(1,"khushbu");
		
		//Saving or serialize map object 
		
		try {
			String path ="G://hashmap.txt";
			File file = new File(path);
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(map);
			
            oos.close();
            fos.close();
            System.out.println("Serialized HashMap data is saved in hashmap.ser");
		} catch (IOException e) { 
			e.printStackTrace();
		}
			
		//Deserialize Object or Reading Object from file
		try {
			
			String path ="G://hashmap.txt";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object object = ois.readObject();
			System.out.println("Reading File By Desirialization ");
			System.out.println(object);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
