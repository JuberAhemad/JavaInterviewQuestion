package com.interview.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to remove element from specified index of ArrayList? 
 **/
public class RemoveElementAtSpecificIndexInArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Juber");
		list.add("Iqra");
		list.add("Ayeza");
		list.add("Khushbu");
		
		list.remove(3);
		
		list.add(1, "Khushbu");
		
		for(String name : list) {
			System.out.println(name);
		}
	}
}
