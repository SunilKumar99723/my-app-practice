package com.mycompany.InterviewQuestion;

	import java.util.*;
	
	class AddElementsToAnArray{
		
	    // Function to add x in arr
	    public static int[] add_element( int myarray[], int ele) 
	    { 
	         int i; 
	 
	         int newArray[] = new int[myarray.length + 1]; 
	        //copy original array into new array
	        for ( i = 0; i<myarray.length ; i++) 
	              newArray[i] = myarray[i]; 
	 
	        //add element to the new array
	        newArray[myarray.length] = ele; 
	 
	        return newArray; 
	    } 
	 
	     public static void main(String[] args) 
	    { 
	      
	 
	        // Original array with size 5 
	        int myArray[] = { 1, 3, 5, 7, 9 }; 
	 
	        System.out.println("Original Array:\n"  + Arrays.toString(myArray)); 
	        
	        //new element to be added to array
	        int ele = 11; 
	 
	        myArray = add_element(myArray, ele); 
	 
	        System.out.println("\nArray after adding " + ele + ":\n" + Arrays.toString(myArray)); 
	    } 
	}