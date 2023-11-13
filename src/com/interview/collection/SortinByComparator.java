package com.interview.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *Write a program to sort ArrayList using Comparable and Comparator? 
 **/
public class SortinByComparator {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("1", "Juber", "juber@gmail.com",35));
		list.add(new Employee("5", "iqra", "iqra@gmail.com",2));
		list.add(new Employee("3", "ayeza", "ayeza@gmail.com",4));
		list.add(new Employee("2", "enaya", "enaya@gmail.com",3));
		list.add(new Employee("4", "anam", "juber@gmail.com",8));
		list.add(new Employee("6", "atif", "atif@gmail.com",6));
		
		Employee.sortById(list);
		
		Employee.sortByName(list);
	}

}
