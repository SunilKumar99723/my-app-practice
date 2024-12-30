package com.mycompany.Array;

public class SecondLargestInArrayExample {
	public static int getSecondLargest(int[] a, int arrSize){  
		int temp;  
		for (int i = 0; i < arrSize; i++)   
		        {  
		            for (int j = i + 1; j < arrSize; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[arrSize-2];  
		}  
public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,22,55};  
		System.out.println("Second Largest: "+getSecondLargest(a,a.length));  
		System.out.println("Second Largest: "+getSecondLargest(b,b.length));  
		}
}  