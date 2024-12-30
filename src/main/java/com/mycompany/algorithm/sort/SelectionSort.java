package com.mycompany.algorithm.sort;

//Java program for implementation of Selection Sort 
class SelectionSort 
{ 
	void sort(int arr[]) 
	{ 
		int n = arr.length; 

		// One by one move boundary of unsorted subarray 
		for (int i = 0; i < n-1; i++) 
		{ 
			// Find the minimum element in unsorted array 
			int min_idx = i; 
			for (int j = i+1; j < n; j++) {
			 System.out.println("i--->> "+i+" j --- >>  " +j+ " arr[j] --- "+arr[j]); 
		     System.out.println("min_idx --- >>> "+min_idx+ " arr[min_idx]--  "+arr[min_idx]);
				if (arr[j] < arr[min_idx]) 
					
					min_idx = j; 
			}
			// Swap the found minimum element with the first 
			// element 
			int temp = arr[min_idx]; 
			arr[min_idx] = arr[i]; 
			arr[i] = temp; 
		} 
	} 

	// Prints the array 
	void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	// Driver code to test above 
	public static void main(String args[]) 
	{ 
		SelectionSort ob = new SelectionSort(); 
		int arr[] = {64,25,233,111,333,12,22,11}; 
		System.out.println("UnSorted array : "); 
		for(int z=0;z<arr.length;z++) {
		System.out.print(+arr[z]+ " "); 
		}
		ob.sort(arr); 
		System.out.println("\n"+"Sorted array"); 
		ob.printArray(arr); 
	} 
} 
/* This code is contributed by Rajat Mishra*/
