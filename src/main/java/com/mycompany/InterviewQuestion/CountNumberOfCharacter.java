package com.mycompany.InterviewQuestion;

//write a program to count the total number of charecter in string excluding the blank spaces.

public class CountNumberOfCharacter {
	public static void main(String[] argrs) {
		
		String str= "Hello world";
		   int count = 0;    
		for(int i=0; i<str.length();i++) {
			
//			boolean ch = str.charAt(i)==' ';
			if(str.charAt(i)!=' ') {
			  count++;    
			}
			System.out.println("char - "+str.charAt(i));
			
		}
		System.out.println("Number of char - "+count);
	}
}
