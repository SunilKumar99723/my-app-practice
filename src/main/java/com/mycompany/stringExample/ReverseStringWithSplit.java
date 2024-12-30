package com.mycompany.stringExample;

// Best way to reverse string
public class ReverseStringWithSplit {
	public static void main(String[] args) {
	String message = "Hello Welcome to India";
	String[] str = message.split(" ");
	int lengthOfString = str.length;
	for(int i = lengthOfString-1 ;  i>=0;  i--)
	{ 
		System.out.print(str[i]);
	}
}
}
