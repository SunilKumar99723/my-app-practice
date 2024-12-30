package com.mycompany.geeksforgeeks.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicatesString {
	
	static void findDuplicates(String strArr[], int n ){
				
		for(int i = 0; i<n-1;i++) {
			for(int j = i+1; j<n;j++) {
				
				if(strArr[i].equals(strArr[j]) && (i!=j)) {
					System.out.print(strArr[j] );	
				
				} 				
			}			
		}		
	}
		
	public static void main(String[] argrs) {
		
		String strArr[] = {"BO","CO","BO"};
		int n = strArr.length;
		FindDuplicatesString.findDuplicates(strArr,n);
		
	}
}
