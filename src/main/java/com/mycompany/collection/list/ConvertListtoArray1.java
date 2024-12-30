package com.mycompany.collection.list;

	// Java program to demonstrate conversion of 
	// Set to array using stream
	import java.util.*;
	  
	class ConvertListtoArray1 {
	    public static void main(String[] args)
	    {
	        List<String> list = new LinkedList<String>();
	        list.add("Mango");
	        list.add("Grapes");
	        list.add("Lemon");
	        list.add("Bread");
	  
	        int n = list.size();
	        String[] arr = list.stream().toArray(String[] ::new);// using stream
	        for (String x : arr)
	            System.out.print(x + " ");
	    }
	}
	
//	Output
//	Geeks for Geeks Practice 