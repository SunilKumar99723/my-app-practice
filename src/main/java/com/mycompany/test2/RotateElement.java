package com.mycompany.test2;

public class RotateElement {
	public static void main(String[] argrs) {

		int arr[] = {1,2,3,5,6};
		
		int n=1; // number of times array should rotate
		
		int last;
		int lengthOfArray= arr.length;
		// rotate the "n" times , which is one time. 
		for (int i=0;i<n;i++) {
			
			last = arr[lengthOfArray-1];
			System.out.println("last -- "+last);
			
			for(int j=lengthOfArray-1;j>0;j--) {
				
				arr[j]=arr[j-1];// shift element of array by one
			}
			arr[0] = last; // last element of array will be addes to the 
		}
		
		System.out.println("Array after right rotation");
		for(int i=0;i<lengthOfArray;i++) {
			
			System.out.println(" Rotate one time " +arr[i]);
		}
		
	}
}
