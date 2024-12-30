package com.mycompany.InterviewQuestion.oracle;

//Java program to find missing number
//using xor
class FindMissingnumber {
 //way -1  Function to find missing number
 static void findMissingnumber(int arr[], int n)
 {
	 int i;
     int temp[] = new int[n + 1];
     
     for (i = 0; i <= n; i++) {
         temp[i] = 0;
     }

     for (i = 0; i < n; i++) {
         temp[arr[i] - 1] = 1;
     }

     int ans = 0;
     for (i = 0; i <= n; i++) {
         if (temp[i] == 0)
             ans = i + 1;
     }
     System.out.println(ans);
 }

 
 // way 2 -Function to find the missing number
 public static int getMissingNo(int[] nums, int n)
 {
     int sum = ((n + 1) * (n + 2)) / 2;
     for (int i = 0; i < n; i++)
         sum -= nums[i];
     return sum;
 }
 /* program to test above function */
 public static void main(String[] args)
 {
     int arr[] = { 1, 3, 4, 5, 6,7 };
     int n = arr.length;

     // Function call
     findMissingnumber(arr, n);
     
     int arr2[] = { 1, 2, 4, 5, 6, 7 };
     int n2 = arr.length;
    System.out.println(getMissingNo(arr2, n2)); 
 }
}
