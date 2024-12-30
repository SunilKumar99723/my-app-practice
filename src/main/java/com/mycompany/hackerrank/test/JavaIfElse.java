package com.mycompany.hackerrank.test;

/*Task
Given an integer, , perform the following conditional actions:

If N is odd, print Weird
If N is even and in the inclusive range of 2 to 5 , print Not Weird
If N is even and in the inclusive range of 6 to 20, print Weird
If N is even and greater than 20 , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.*/
import java.util.Scanner;

public class JavaIfElse {
	
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	System.out.println("Enter the N value : ");
	        int N = scanner.nextInt();
	          
	        if((N%2==0) && (N <= 6 && N <= 20)  ) {
	        	System.out.println("Not Weird");
	        }
	        
	        
	        else if ((N%2==0) && N > 20) {
	        	System.out.println("Not Weird");
	        }	 
	        else
	        System.out.println("Weird");
	        scanner.close();
	    }
	}

