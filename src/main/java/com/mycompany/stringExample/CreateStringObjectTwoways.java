package com.mycompany.stringExample;

public class CreateStringObjectTwoways {
	public static void main(String args[]){ 
//		way 1- Assigning a string value wrapped in " " to a String type variable.
		String message = "Hello Welcome to India";
//		way 2- Creating an object of the String class using the new keyword by passing the string value as a parameter of its constructor.
		String message1 = new String ("Hello Welcome to Nepal");
//		way 3- Passing a character array to the String constructor.
		char arr[] = {'H','e','l','l','o'};
		String message2 = new String(arr);
		System.out.println(message);   
		System.out.println(message1);  
		System.out.println(message2); 
		}
}
