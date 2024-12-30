package com.mycompany.InterviewQuestion;

	// Java program to demonstrate conversion of 
	// Set to array using stream
	import java.util.*;
	  
	class ConvertListtoArray {
	    public static void main(String[] args)
	    {
	        List<String> list = new LinkedList<String>();
	        list.add("Geeks");
	        list.add("for");
	        list.add("Geeks");
	        list.add("Practice");
	  
	        int n = list.size();
	        String[] arr = list.stream().toArray(String[] ::new);
	        for (String x : arr)
	            System.out.print(x + " ");
	        
	         // Using loop
	        
	        String[] array = new String[list.size()];
	        
	        // Converting ArrayList to Array
	        // using get() method
	        for (int i = 0; i < list.size(); i++)
	        	array[i] = list.get(i);
	 
	        // Printing elements of array on console
	        for (String x : array)
	            System.out.print(x + " ");
	        
	    }
	}
	
//	Output
//	Geeks for Geeks Practice 