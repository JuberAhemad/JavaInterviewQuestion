package com.interview.collection;

import java.util.HashSet;

/**
 * Write a program to convert HashSet to Array? 
 **/
public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
        set.add("Juber");
        //converting HashSet to Array
        // Creating an Array of HashSet size
        String[] array1 = new String[set.size()];
        String[] array2 = set.toArray(array1);
        //Object[] array = set.toArray();
        for(Object obj : array2) {
        	System.out.println(obj);
        }
	}

}
