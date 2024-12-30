package com.mycompany.stringExample;

/*Converting String to character array: The user input the string to be reversed. 
Method: 
1. First, convert String to character array
   by using the built in Java String class 
   method toCharArray().
2. Then, scan the string from end  to start, 
   and print the character one by one.*/
public class ReverseStringType3 {

	public static void main(String[] args) {

		 String input = "Algorithm";
//		 String[] s=input.split(input);
	        // convert String to character array
	        // by using toCharArray
	        char[] ch = input.toCharArray();
	 
	        for (int i = ch.length - 1; i >= 0; i--)
	            System.out.print(ch[i]);
	    }
	}


