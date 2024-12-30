package com.mycompany.geeksforgeeks.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateInteger {
	
	 //Method 1 : Brute Force Method - This will find which is 2 times duplicate and print, for 3 times not print
	static void duplicates(int arr[], int n ){
				
		for(int i = 0; i<n-1;i++) {
			for(int j = i+1; j<n;j++) {
				
				if(arr[i]==arr[j] ) {
					System.out.println(arr[j] );	
				
				} 				
			}			
		}		
	}
		
	//Method 2 : Sorting Method
    
    private static void findDuplicatesUsingSorting(int inputArray[])
    {
        Arrays.sort(inputArray);
         
        for (int i = 0; i < inputArray.length-1; i++)
        {
            if(inputArray[i]==inputArray[i+1])
            {
                System.out.println("Duplicate Element findDuplicatesUsingSorting: " + inputArray[i]);
            }
        }
    }
	//Method 3 : Using HashSet
    
    private static void findDuplicatesUsingHashSet(int inputArray[] )
    {
        HashSet<Integer> set = new HashSet<Integer>();
         
        for (int element : inputArray) 
        {
            if( ! set.add(element))
            {
                System.out.println("Duplicate Element : "+element);
            }
        }
    }
    
    
    //Method 4 : Using HashMap
     
    private static void findDuplicatesUsingHashMap(int[] inputArray)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
         
        for (int element : inputArray) 
        {   
            if(map.get(element) == null)
            {
                map.put(element, 1);
            }
            else
            {
                map.put(element, map.get(element)+1);
            }
        }
         
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
         
        for (Entry<Integer, Integer> entry : entrySet) 
        {               
            if(entry.getValue() > 1)
            {
                System.out.println("Duplicate Element : "+entry.getKey()+" - found "+entry.getValue()+" times.");
            }
        }
    }
	
    
  //Method 5 : Using Java 8 Streams
    
    private static void findDuplicatesUsingJava8(int[] inputArray) 
    {   
        Set<Integer> uniqueElements = new HashSet<>();
         
        Set<Integer> duplicateElements =  Arrays.stream(inputArray)
                                                .filter(i -> !uniqueElements.add(i))
                                                .boxed()
                                                .collect(Collectors.toSet());
         
        System.out.println("Using Java 8 Streams duplicates - "+duplicateElements);
    }
    
    private static void findDuplicatesUsingHashSets(int[] inputArray) 
    {     
		    Set arrSet = new HashSet<>();
		    
		    for (int i = 0; i < inputArray.length; i++) {
		      
		       if (arrSet.contains(inputArray[i])) {
		          System.out.println(inputArray[i]);
		       } else {
		          arrSet.add(inputArray[i]);
		       }
		    } 
    }
	public static void main(String[] argrs) {
		int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 };
		int n = arr.length;
		FindDuplicateInteger.duplicates(arr, n);
		FindDuplicateInteger.findDuplicatesUsingSorting(arr); //Method 2 : Sorting Method
		FindDuplicateInteger.findDuplicatesUsingHashSet(arr); //Method 3 : Using HashSet
		FindDuplicateInteger.findDuplicatesUsingHashMap(arr); //Method 4 : Using HashMap
	    FindDuplicateInteger.findDuplicatesUsingJava8(arr);  //Method 5 : Using Java 8 Streams
	    FindDuplicateInteger.findDuplicatesUsingHashSets(arr);//Method 6 : Using HashSet
	}
}
