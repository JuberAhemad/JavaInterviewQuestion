package com.interview.exception;

import java.util.Scanner;

public class ByUsingThrows {

	public static void main(String[] args){
		System.out.println("Enter Age");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		try {
			int age = get(x);
			if (age<18) {
				throw new Age("For DL Age Must Be greater than or Equal to 18 year ");
			}else {
				System.out.println("You are eligible for driving lincence : "+age+" years");
			}
			
		}catch (Age a) {
			a.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Always Enter Valid age ");
		}
	}

	public static int get(int x) throws Age{
		Age age = new Age();
		age.setAge(x);
		int age2 = age.getAge();
		return age2;
	}
}
