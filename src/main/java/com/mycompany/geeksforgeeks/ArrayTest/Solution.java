package com.mycompany.geeksforgeeks.ArrayTest;

// Sales by Match 
//input (stdin) -9
//		10 20 20 10 10 30 50 10 20
//Your Output (stdout)
//	the number of pairs	3
//Expected Output
//	the number of pairs	3


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int res=0;
        int i=0;
        while(i<n){
            int number = ar[i];
            int count=1;
            i++;
            while(i<n && ar[i]==number){
                count++;
                i++;
            }
            if(count>=2){
                res=res+ count/2;
            }
        }
return res;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of element"); 
        int n = scanner.nextInt();

        int[] ar = new int[n];
        System.out.println("Enter the array2 element");  
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }

        int result = sockMerchant(n, ar);
        System.out.println("The number of pairs is - "+result); 
    }
}
