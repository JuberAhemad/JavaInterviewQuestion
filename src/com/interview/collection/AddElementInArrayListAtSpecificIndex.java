package com.interview.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *Write a program to add element at particular index of ArrayList? 
 **/
public class AddElementInArrayListAtSpecificIndex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Juber");
		list.add("Ayeza");
		list.add("Iqra");
		
		list.add(0, "Khushbu");
		list.add("Atif");
		list.add(2, "Enaya");
		
		for(String name : list) {
			System.out.println(name);
			
		}

	}

}
