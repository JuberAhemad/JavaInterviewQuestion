package com.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 *Write a program to sort ArrayList using Comparable and Comparator? 
 **/
public class SortingByComparable {

	public static void main(String[] args) {
		Student student = new Student();

		List<Student> list= new ArrayList<>();
		list.add(new Student("1", "Juber", "juber@gmail.com", null));
		list.add(new Student("5", "Iqra", "iqra@gmail.com", null));
		list.add(new Student("3", "Ayeza", "ayeza@gmail.com", null));
		list.add(new Student("2", "Atif", "atif@gmail.com", null));
		list.add(new Student("7", "Anam", "anam@gmail.com", null));
		list.add(new Student("6", "Afsha", "afsa@gmail.com", null));

		Collections.sort(list);
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
