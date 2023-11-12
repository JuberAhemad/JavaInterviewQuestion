package com.interview.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *Given an element write a program to check if element(value) exists in ArrayList? 
 **/
public class SearchElementInList {

	public static void main(String[] args) {

		List<String> list=new ArrayList<>();
		list.add("Juber Ahemad");
		list.add("Iqra");
		list.add("Ayeza");
		list.add("Atif");
		list.add("Anam");
		
		/**
		 *By core java simple Logic search element in ArrayList 
		 **/

		if (list.contains("Iqra")) {
			System.out.println("Iqra was found in the list");
		} else {
			System.out.println("Iqra was not found in the list");
		}

		/**
		 *By core java simple Logic search element in ArrayList 
		 **/

		for(String name:list) {
			if (name.equals("Iqra")) {
				System.out.println("Searched Element is Present in ArrayList = " +name);
			}else {
				System.out.println("Searched Element is not present in list");
			}
		}

		/**
		 *By Using Java 8 Stream API search element in ArrayList 
		 **/

		Stream<String> stream = list.stream();
		Stream<String> filter = stream.filter(e->e.equals("Ahemad"));
		List<String> name = filter.collect(Collectors.toList());
		if (name.isEmpty()) {
			System.out.println("--Searched Element is not present in list--");
		}else {
			System.out.println("Searched Element is Present in ArrayList = " +name);
		}

	}

}
