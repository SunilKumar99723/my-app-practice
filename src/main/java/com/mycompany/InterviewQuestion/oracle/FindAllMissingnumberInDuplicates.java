package com.mycompany.InterviewQuestion.oracle;

import java.util.Arrays;
import java.util.HashSet;

/* Java Program to find missing numbers in an integer array with duplicates. 
 * Array may contains more than one duplicates. 
 * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9}; 
 * output: 4, 6, 8 
 */

public class FindAllMissingnumberInDuplicates {
	
	public static void main(String[] args) {
		      // given input 
				int[] input = { 1, 1, 2, 3, 5, 5, 7, 9, 9, 9 }; 
				
				HashSet<Integer> set = new HashSet<>();
				for(int j =0;j<input.length;j++) {
					set.add(input[j]) ;
				}
				
				System.out.println(set);
				// let's create another array with same length 
				// by default all index will contain zero 
				// default value for int variable 
				System.out.println(Arrays.toString(input));
				int[] register = new int[input.length];
				
				// now let's iterate over given array to 
				// mark all present numbers in our register 
				// array 	
				for (int i : input) 
				{ 
					register[i] = 1;
				 
				} 
				
				// now, let's print all the absentees 
				System.out.println("missing numbers in given array"); 
				for (int i = 1; i < register.length; i++) 
				{ if (register[i] == 0) 
				      { System.out.println(i); } 
				} 
		
	      	}
	}

		


