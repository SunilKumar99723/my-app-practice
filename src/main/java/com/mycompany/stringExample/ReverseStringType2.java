package com.mycompany.stringExample;

//reverse string with using inbuild function
public class ReverseStringType2 {
	    public static void main(String[] args)
	    {
	        String input = "Jeet aapki";
	 
	        StringBuilder input1 = new StringBuilder();
	 
	        // append a string into StringBuilder input1
	        input1.append(input);
	 
	        // reverse StringBuilder input1
	        input1.reverse();
	 
	        // print reversed String
	        System.out.println(input1);
	    }
	}
