package com.interview.collection;

import java.util.ArrayList;
import java.util.List;

/**
 *Write a program to convert List to Array. 
 **/
public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Juber Ahemad");
		list.add("Iqra");
		list.add("Ayeza");
		list.add("Atif");
		list.add("Anam");

		Object[] array = list.toArray();
		for(Object name:array) {
			System.out.println(name);
		}
	}
}
