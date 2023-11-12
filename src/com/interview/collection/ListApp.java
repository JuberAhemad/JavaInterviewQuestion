package com.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *Write a program to traverse (or iterate) ArrayList? 
 **/
public class ListApp {

	public static void main(String[] args) {
		System.out.println("Hello Git And GitHub");
		
		List<String> list=new ArrayList<>();
		list.add("Juber Ahemad");
		list.add("Iqra");
		list.add("Ayeza");
		list.add("Atif");
		list.add("Anam");
		/**
		 * Iterate List By Using Iterator
		 **/
		Iterator<String> itr=list.iterator();
         while(itr.hasNext()) {
        	 String name=itr.next();
        	 System.out.println(name);
         }
         
         /**
 		 * Iterate List By Using Java 8 lambda Expression and forEach() Function
 		 **/
         
         list.forEach(e->System.out.println(e));
         
         /**
  		 * Iterate List By Using Java 8 Stream Function
  		 **/
         
         List<String> names=list.stream().collect(Collectors.toList());
         System.out.println(names);
	}

}
