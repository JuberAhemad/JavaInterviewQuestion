package com.interview.collection;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListApp {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Juber");
        list.add("Iqra");
        list.add("Ayeza");
        
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
        	String name=iterator.next();        	
        	//trying to add new element in list
        	list.add("Khushbu");
        	System.out.println(name);
        }
	}

}
