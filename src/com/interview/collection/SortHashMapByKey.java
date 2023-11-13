package com.interview.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/**
 * Write a program to sort HashMap by keys ? 
 **/
public class SortHashMapByKey {

	public static void main(String[] args) {
		 
		Map<Integer, String> map = new HashMap<>();
		map.put(8, "Juber Ahemad");
		map.put(6, "Iqra");
		map.put(3, "Ayeza");
		map.put(5, "Atif");
		map.put(1, "anam");
		map.put(9, "Dildar");
		
		//Sorting HasMap by key and value by Using TreeMap
		
	    TreeMap<Integer,String> tree=new TreeMap<>(map);
	    Set<Entry<Integer, String>> entrySet = tree.entrySet();
	    Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
	    while(iterator.hasNext()) {
	    	
	    	Map.Entry pair = (Map.Entry)iterator.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	                
	    }	          
	}
}
