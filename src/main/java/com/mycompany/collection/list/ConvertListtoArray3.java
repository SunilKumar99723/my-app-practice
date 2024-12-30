package com.mycompany.collection.list;


	// Java program to convert a List to an array
	// using get() in a loop.
	import java.io.*;
	import java.util.List;
	import java.util.LinkedList;
	  
	class ConvertListtoArray3
	{
	    public static void main (String[] args)
	    {
	        List<String> list = new LinkedList<String>();
	        list.add("Sunil");
	        list.add("Ajay");
	        list.add("Anil");
	        list.add("Sanjay");
	  
	        String[] arr = new String[list.size()];
	  
	        // ArrayList to Array Conversion using get() in a loop.
	        for (int i =0; i < list.size(); i++)
	            arr[i] = list.get(i);              //using get() in a loop.
	  
	        for (String x : arr)
	            System.out.print(x + " ");
	    }
	}