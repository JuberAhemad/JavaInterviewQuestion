package com.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *Write a program to sort ArrayList in descending order? 
 **/
public class SortArrayListInAssendingAndDecendingOrder {

	public static void main(String[] args) {
		
		List<Children> list = new ArrayList<Children>();
		list.add(new Children(1, "iqra", "iqra@gmail.com", 2));
		list.add(new Children(3, "ayeza", "ayeza@gmail.com", 4));
		list.add(new Children(4, "enaya", "enaya@gmail.com", 3));
		list.add(new Children(2, "atif", "atif@gmail.com", 6));
		list.add(new Children(7, "fayeza", "fayeza@gmail.com", 1));
		
		//Collections.reverse(list);
		//list.forEach(e->System.out.println(e));
		
		Collections.reverseOrder();
		
		list.forEach(e->System.out.println(e));
		
	}

}
