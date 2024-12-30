package com.mycompany.InterviewQuestion;

import java.util.HashMap;
import java.util.Map;

public class FindNthTimesRepeatNumberInString {
	// Function to print all K digit
	// repeating numbers
	static void print_Kdigit(String S, int K)
	{	     
	    // Map to store the substrings
	    // with their frequencies
	    Map<String, Integer> m = new HashMap<>();
	 
	    // Iterate over every substring
	    // and store their frequencies
	    // in the map
	    for(int i = 0; i < S.length() - K; i++)
	    {
	        String a = S.substring(i, i + K);
	 
	        // Increment the count of
	        // substrings in map
	        m.put(a, m.getOrDefault(a, 0) + 1);
	         
	    }
	 
	    // Iterate over all the substrings
	    // present in the map
	    for(Map.Entry<String, Integer> x : m.entrySet())
	    {
	         
	        // Condition to check if the
	        // frequency of the substring
	        // present in the map
	        // is greater than 1
	        if (x.getValue() > 1)
	        {
	            System.out.println(x.getKey() + " Repeat - " +x.getValue()+ "  times");
	        }
	    }
	}
	
	public static void main(String[] argrs) {
		
		 	String str = "123412345123456";
		 
		    // Given K
		    int K = 3;
		     
		    // Function call
		    print_Kdigit(str, K);

	}
}
