package com.mycompany.test2;

public class SumArray {
	public static void main(String[] argrs) {
		

		int[] arr = {-5, 0, 3, -2, 8,0, 5, 0, -1, -6}; // 3-2+8+5 =14
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0) {
			sum = sum +arr[i];
			}
		}
		System.out.println(" Sum of Array " +sum);
	}
}
