package com.interview.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a program to find the length of the ArrayList? 
 **/
public class FindLengthOfArrayList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("Juber Ahemad");
		list.add("Iqra");
		list.add("Ayeza");
		list.add("Atif");
		list.add("Anam");
		
		int size = list.size();
		System.out.println("Size of List is = "+size);

	}

}
