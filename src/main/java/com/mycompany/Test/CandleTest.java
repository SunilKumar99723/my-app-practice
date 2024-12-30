package com.mycompany.Test;
import java.util.*;

  
public class CandleTest {
	// Java implementation to find the
	// minimum and maximum amount
	
	    // Function to find the minimum
	    // amount to buy all candies
	    static int findMinimum(int arr[], int n, int k)
	    {
	        int res = 0;
	        for (int i = 0; i < n; i++) {
	            // Buy current candy
	            res += arr[i];
	  
	            // And take k candies for free
	            // from the last
	            n = n - k;
	        }
	        return res;
	    }
	  
	    // Function to find the maximum
	    // amount to buy all candies
	    static int findMaximum(int arr[], int n, int k)
	    {
	        int res = 0, index = 0;
	  
	        for (int i = n - 1; i >= index; i--) 
	        {
	            // Buy candy with maximum amount
	            res += arr[i];
	  
	            // And get k candies for free from
	            // the starting
	            index += k;
	        }
	        return res;
	    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        int arr[] = { 3, 2, 1, 4 };
	        int n = arr.length;
	        int k = 2;
	        Arrays.sort(arr);
	  
	        // Function call
	        System.out.println(findMinimum(arr, n, k) + " "
	                           + findMaximum(arr, n, k));
	    }
	}

