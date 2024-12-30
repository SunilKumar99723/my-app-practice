package com.mycompany.InterviewQuestion.FiveWaysToCreateObject;



	// Java program to Illustrate Creation of Object
	// Using clone() method
	 
	// Main class
	// Implementing Cloneable interface
public class Way3UsingClone  implements Cloneable {
	 
	    // Method 1
	    @Override
	    protected Object clone()
	        throws CloneNotSupportedException
	    {
	        // Super() keyword refers to parent class
	        return super.clone();
	    }
	 
	    // Declaring and initializing string
	    String name = "GeeksForGeeks";
	 
	    // Method 2
	    // main driver method
	    public static void main(String[] args)
	    {
	    	Way3UsingClone obj1 = new Way3UsingClone();
	 
	        // Try block to check for exceptios
	        try {
	 
	            // Using the clome() method
	        	Way3UsingClone obj2 = (Way3UsingClone)obj1.clone();
	 
	            // Print and display the main class object
	            // as created above
	        	 System.out.println(obj1.name);
	            System.out.println(obj2.name);
	        }
	 
	        // Catch block to handle the exceptions
	        catch (CloneNotSupportedException e) {
	 
	            // Display the exception
	            // using printStackTrace() method
	            e.printStackTrace();
	        }
	    }
	}