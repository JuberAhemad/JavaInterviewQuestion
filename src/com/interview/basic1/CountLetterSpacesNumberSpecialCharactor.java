package com.interview.basic1;
/**
 * Write a Java program to count letters, spaces, numbers and other characters in an input string
 **/
public class CountLetterSpacesNumberSpecialCharactor {

	public static void main(String[] args) {

		String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
		int letter =0;
		int number =0;
		int spaces =0;
		int other =0;

		char[] ch = string.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}else if (Character.isDigit(ch[i])) {
				number++;
			}else if (Character.isWhitespace(ch[i])) {
				spaces++;
			}else {
				other++;
			}
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + spaces);
		System.out.println("number: " + number);
		System.out.println("other: " + other);
	}

}
