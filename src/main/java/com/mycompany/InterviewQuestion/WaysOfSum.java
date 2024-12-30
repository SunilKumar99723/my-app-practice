package com.mycompany.InterviewQuestion;

import java.util.stream.IntStream;

public class WaysOfSum {

	static int simpleArraySum(int arr[], int lengthOfArr) {

	    int sum = 0;

	    for(int i = 0; i < lengthOfArr; i++) {
	        sum = sum + arr[i];
	    }
	    return sum;
	}
	public static void main(String[] args)
	{
		int arr[] = { 12, 3, 4, 15 };
		
		//way1 
		simpleArraySum(arr, arr.length);
		System.out.println(simpleArraySum(arr, arr.length));
		
		//way2 -using java8, you can use streams
		int sum = IntStream.of(arr).sum();
		System.out.println("The sum is " + sum);
		
	}
}
