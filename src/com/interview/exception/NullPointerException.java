package com.interview.exception;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NullPointerException {

	public static void main(String[] args) {
		List<String> user = getUser();
		//System.out.println(user.get(0));

		Iterator<String> iterator = user.iterator();
		while(iterator.hasNext()) {
			String ele = iterator.next();
			System.out.println(ele);
		}
	}
	
	public static List<String> getUser(){
		List<String> list=null;
		try {
			//list = new ArrayList<>();
			//list.add("Juber");
			//list.add("Iqra");
			//list.add("Ayeza");
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}			
		return list;
	}
}
