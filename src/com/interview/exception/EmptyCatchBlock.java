package com.interview.exception;
/**
 * Can you have an empty catch block?
 * A catch block is used to catch the exceptions found in the try block. Actually,
 * we can have an empty catch block, but there are better practices to implement.
 **/
public class EmptyCatchBlock {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			int z=x/y;
			System.out.println("Division Is "+z);
		} catch (ArithmeticException ae) {
			// An empty catch block
			//ae.printStackTrace();
		}catch (Exception e) {
			// An empty catch block
			//e.printStackTrace();
		}finally {
			System.out.println("Finally Block is executing");
		}       
		System.out.println("After Finally Block");
	}
}
