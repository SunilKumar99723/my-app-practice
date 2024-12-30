package com.mycompany.collection.map;

import java.util.HashMap;

public class calculateHashcodeOfString 
{
    public static void main(String[] args) 
    {
//        String blogName = "howtodoinjava.com";
//         
//        System.out.println( blogName.hashCode() );
//       
    	HashMap<String, Integer> map = new HashMap<>();  
    	map.put("Vishal", 19);  
    	map.put("Sunny", 29);  
    	map.put("Ritesh", 39); 
    	
    	String str ="Aman";
    	
    	int hascode =str.hashCode();
        System.out.println("Hash code of string -->>> "+hascode );
        
        // Calculating index
        
        int n =16; // Size of array
      int index = 2657860 & (n-1);
      
      System.out.println("Calculating index -->>> "+index );
        
    }
}