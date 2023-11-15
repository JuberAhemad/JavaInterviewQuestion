package com.interview.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * How to synchronize a HashMap in java? 
 **/
public class SynchronizedHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		
		//Synchronized HashMap by Collections class of java.util package 
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        
	}

}
