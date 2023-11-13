package com.interview.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a program to convert LinkedList to ArrayList? 
 **/

public class ConvertLinkedListToArrayList {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Juber");
		ll.add("Iqra");
		ll.add("Ayeza");
		ll.add("Khushbu");
		//Converting  LinkedList to ArrayList  by passing Linked List in to Array List constructor
		List<String> list = new ArrayList<>(ll);
		
		for(Object name : list) {
			System.out.println(name);
		}
		
	}
}
