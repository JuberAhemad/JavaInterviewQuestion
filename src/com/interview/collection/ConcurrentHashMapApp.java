package com.interview.collection;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapApp {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> cm=new ConcurrentHashMap<>();
		cm.put(1, "Juber");
		cm.put(2, "Iqra");
		cm.put(3, "Ayeza");
		
		System.out.println("-----------Finding value of Cuncurrent Hash Map----------");
		Collection<String> values = cm.values();
		System.out.println(values);
		
		System.out.println("-----------Traversing Cuncurrent Hash Map----------");
		Set<Entry<Integer,String>> entry =cm.entrySet();
		Iterator<Entry<Integer,String>> itr=entry.iterator();
		while(itr.hasNext()) {
			Map.Entry map=(Map.Entry)itr.next();
			System.out.println(map.getKey()+" : "+map.getValue());
			
			//trying to add new element in map during iteration
			cm.put(4, "Khushbu");
		}
	}

}
