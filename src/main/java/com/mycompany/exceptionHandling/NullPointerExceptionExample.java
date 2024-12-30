package com.mycompany.exceptionHandling;

import org.apache.commons.lang3.StringUtils;

public class NullPointerExceptionExample {
    
	//NullPointerException
//	private static void printLength(String str) {
//        System.out.println(str.length());
//    }

    //fix 
	 private static void printLength(String str) {
	        if (StringUtils.isNotEmpty(str)) {
	            System.out.println(str.length());
	        } else {
	            System.out.println("Empty string");
	        }
	    }
    
    
    public static void main(String args[]) {
        String myString = null;
        printLength(myString);
    }
}