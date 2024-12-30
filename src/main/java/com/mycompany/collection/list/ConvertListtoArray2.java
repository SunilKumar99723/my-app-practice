package com.mycompany.collection.list;

	// Java program to convert a List to an array
	// using toArray() in a loop.
	import java.util.*;
	  
	public class ConvertListtoArray2 {
	    public static void main(String[] args)
	    {
	        List<String> list = new LinkedList<String>();
	        list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	        list.add("Practice");
	  
	        String[] arr = list.toArray(new String[0]);// using toArray() in a loop.
	  
	        for (String x : arr)
	            System.out.print(x + " ");
	    }
	}