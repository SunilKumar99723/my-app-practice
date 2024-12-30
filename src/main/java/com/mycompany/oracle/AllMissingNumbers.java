package com.mycompany.oracle;

//Efficient Approach: The idea is to use Hashing to optimize the above approach. Create a boolean array(say b[]) of size equal to the maximum element in the array and mark only those positions in the array b[] which are present in the given array. Print all the index in the array b[] that are not marked. 
//Below are the steps:  
//
//Initialize a boolean array b[] with zero of size equals to the maximum element of the array.
//Iterate over the given array and mark for each element in the given array mark that index as true in the array b[].
//Now traverse the given array b[] from index arr[0] and print those index whose value is false as they are the element that is missing in the given array.
//Below is the implementation of the above approach:
	// Java program for the above approach
	import java.util.*;
	 
	public class AllMissingNumbers {
	     
	// Function to find the missing elements
	static void printMissingElements(int arr[],
	                                int N)
	{
	     
	    // Initialize an array with zero
	    // of size equals to the maximum
	    // element in the array
	    int[] b = new int[arr[N - 1] + 1];
	 
	    // Make b[i]=1 if i is present
	    // in the array
	    for(int i = 0; i < N; i++)
	    {
	         
	        // If the element is present
	        // make b[arr[i]]=1
	        b[arr[i]] = 1;
	    }
	 
	    // Print the indices where b[i]=0
	    for(int i = arr[0]; i <= arr[N - 1]; i++)
	    {
	        if (b[i] == 0)
	        {
	            System.out.print(i + " ");
	        }
	    }
	}
	 
	// Driver Code
	public static void main (String[] args)
	{
	     
	    // Given array arr[]
	    int arr[] = { 6, 7, 10, 11, 13,15 };
	     
	    int N = arr.length;
	     
	    // Function call
	    printMissingElements(arr, N);
	}
	}

