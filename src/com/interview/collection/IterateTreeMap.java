package com.interview.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Write a program to iterate TreeMap in java? 
 **/
public class IterateTreeMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();

		map.put(2,"juber");
		map.put(5,"iqra");
		map.put(8,"ayeza");
		map.put(3,"atif");
		map.put(9,"anam");
		map.put(4,"fayeza");
		map.put(1,"khushbu");

		Set<Entry<Integer,String>> entry=map.entrySet();
		Iterator<Entry<Integer,String>> itr=entry.iterator();
		while(itr.hasNext()) {
			Map.Entry kv =(Map.Entry)itr.next();
			System.out.print("Key is: "+kv.getKey() + " and ");
			System.out.println("Value is: "+kv.getValue());
		}
	}
}
