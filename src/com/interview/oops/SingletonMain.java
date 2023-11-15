package com.interview.oops;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		if (obj1==obj2) {
           System.out.println("Both Object are equal");
		}else {
			System.out.println("Different Object");
		}
	}
}
