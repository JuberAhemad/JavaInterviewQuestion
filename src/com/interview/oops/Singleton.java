package com.interview.oops;

public class Singleton {
	
	private static Singleton instance=null;
	
	private Singleton() {
		System.out.println("Creating Object");
	}

	public static Singleton getInstance() {
		if (instance==null) {
			Singleton instance=new Singleton();
			return instance;
		}
		return instance;
	}
}
