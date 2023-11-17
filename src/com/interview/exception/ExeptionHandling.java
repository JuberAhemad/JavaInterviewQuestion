package com.interview.exception;

public class ExeptionHandling {

	public static void main(String[] args) {
		int x =10;
		int y=10;
		try {
			int z = x/y;
			System.out.println("Division is : "+z);
			//System.exit(0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Block is execuing");
		}
	}
}
