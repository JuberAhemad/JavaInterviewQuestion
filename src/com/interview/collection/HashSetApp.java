package com.interview.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Write a program to traverse(or iterate) HashSet? 
 **/
public class HashSetApp {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Juber");
		set.add("Iqra");
		set.add("ayeza");
		set.add("atif");
		
		/**
		 *Iterate HashSet By Using Enhanced For Loop  
		 **/
		
		for(String name : set) {
			System.out.println(name);
		}
		
		/**
		 *Iterate HashSet By Iterator  
		 **/
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			String name=itr.next();
			System.out.println(name);
		}
		
		/**
		 *Iterate HashSet By forEach() method 
		 **/
		
		set.forEach(e->System.out.println(e));
		
		/**
		 *Iterate HashSet By Stream API
		 **/
		
		Stream<String> stream=set.stream();
		Set<String> names=stream.collect(Collectors.toSet());
        System.out.println(names);
	}

}
