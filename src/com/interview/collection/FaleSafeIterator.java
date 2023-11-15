package com.interview.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FaleSafeIterator {

	public static void main(String[] args) {
		System.out.println("--------------Fale Fast Iterator---------------");
		List<String> list = new ArrayList<>();
		list.add("Juber");
		list.add("Iqra");
		list.add("Ayeza");
		
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			//list.add("bdscbd");
			//Exception in thread "main" java.util.ConcurrentModificationException
		}
		
		System.out.println("--------------Fale Safe Iterator---------------");
		
		CopyOnWriteArrayList<String> cowl = new CopyOnWriteArrayList<>();
		
		cowl.add("Juber");
		cowl.add("Iqra");
		cowl.add("Ayeza");
		
		Iterator<String> iterator = cowl.iterator();
		while(iterator.hasNext()){
			String name = iterator.next();		
			System.out.println(name);
			cowl.add("Khushbu");
			System.out.println(cowl.size());
		}
	}
}
