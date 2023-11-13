package com.interview.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *Write a program to add elements to the HashMap given the key and value data type is String? 
 **/
public class AddElementInToHashMap {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("name", "Juber Ahemad");
		map.put("email", "juber@gmail.com");
		map.put("dept", "IT");
		map.put("phone", "9555910872");
		Set<Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<String, String> mapset = iterator.next();
			System.out.println(mapset);
		}
		
		
	}

}
