package com.mycompany.InterviewQuestion;

import java.util.Arrays;

public class SortStringAndDigit {
	   static void sortString(String str) {
	       
	       
	        
	        String numberOnly= str.replaceAll("[^0-9]", "");
	        System.out.println("Sorted number --- "+numberOnly);
	        
	        String charOnly = str.replaceAll("[^a-zA-Z]", "");
	        System.out.println("Sorted Char --- "+charOnly);
	        
	        char []arr1 = numberOnly.toCharArray();	
	        char []arr2 = charOnly.toCharArray();	
	         Arrays.sort(arr2) ;
	         Arrays.sort(arr1);
	        System.out.print("Sorted value -- "+ String.valueOf(arr2) + String.valueOf(arr1));
	    }
	 
	    public static void main(String[] args) {
	        String s = "879bjep7642";
	        sortString(s);
	    }
}
