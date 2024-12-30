package com.mycompany.InterviewQuestion.FiveWaysToCreateObject;

//public class Way4UsingDeserialization {

	// Importing input output classes
	import java.io.*;
	 
	// Main class
	// Implementing the Serializable interface
	class Way4UsingDeserialization implements Serializable {
	 
	    // Member variables
	    private String name;
	    Way4UsingDeserialization(String name)
	    {
	        // This keyword refers to current object itself
	        this.name = name;
	    }
	 
	    // Main driver method
	    public static void main(String[] args)
	    {
	        // Try block to check for exceptions
	        try {
	            // Creating object of class in main() method
	        	Way4UsingDeserialization objOfMainClass = new Way4UsingDeserialization("GeeksForGeeks");
	 
	            FileOutputStream f  = 
	            		new FileOutputStream("C:\\JavaPractice\\CreateObjectUsindDeSerialize.txt");
	            ObjectOutputStream oos = new ObjectOutputStream(f);
	            oos.writeObject(objOfMainClass);
	            oos.close();
	 
	            // Freeing up memory resources
	            f.close();
	        }
	 
	        // Catch block to handle the exceptiona
	        catch (Exception e) {
	            // Display the exception along with line number
	            // using printStacktrace() method
	            e.printStackTrace();
	        }
	    }
	}