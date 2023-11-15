package com.interview.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Write a program to sort HashMap by value? 
 **/
public class SortHashMapByValue {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(2,"juber");
		map.put(5,"iqra");
		map.put(8,"ayeza");
		map.put(3,"atif");
		map.put(9,"anam");
		map.put(4,"fayeza");
		map.put(1,"khushbu");

		Map<Integer,String> tree=new TreeMap<>(map);
		Set<Entry<Integer, String>> entrySet = tree.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Map.Entry entry = (Map.Entry)iterator.next();
			System.out.print(entry.getKey()+":");
			System.out.println(entry.getValue());
		}
	}

}
