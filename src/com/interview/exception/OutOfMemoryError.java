package com.interview.exception;
/**
 *What is the exception OutOfMemoryError in Java?
 *It is the sub class of java.lang.Error encountered when the JVM runs out of memory. 
 **/
public class OutOfMemoryError {

	public static void main(String[] args) {

		try {
			System.out.println("Try Block is executing");
            throw new Exception();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Block is executing");
		}
		
		//After finally block 
		System.out.println("After finally Block");
	}
}
