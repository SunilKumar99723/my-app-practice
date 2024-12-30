package com.mycompany.test2;    // Java program to sum two numbers
	// represented two arrays.
	import java.io.*;

	class AddTwoArray {

		// Return sum of two number represented by
		// the arrays. Size of a[] is greater than
		// b[]. It is made sure be the wrapper
		// function
		static int calSumUtil(int a[], int b[],
									int n, int m)
		{
			// array to store sum.
			int[] sum= new int[n];
		
			int i = n - 1, j = m - 1, k = n - 1;
		
			int carry = 0, s = 0;
		
			// Until we reach beginning of array.
			// we are comparing only for second
			// array because we have already compare
			// the size of array in wrapper function.
			while (j >= 0)
			{
				System.out.println("********** j >= 0 ************" );
				// find sum of corresponding element
				// of both array.
				System.out.println("a[i] - "+a[i]+ " b[j] - "+b[j]+ " carry - "+carry  );
				s = a[i] + b[j] + carry;
				System.out.println("s - "+s );
				sum[k] = (s % 10);
				System.out.println("sum[K] - "+sum[k] );
				// Finding carry for next sum.
				carry = s / 10;
		
				k--;
				i--;
				j--;
			}
		
			// If second array size is less
			// the first array size.
			while (i >= 0)
			{	System.out.println("********** i >= 0 ************" );
				// Add carry to first array elements.
				s = a[i] + carry;
				sum[k] = (s % 10);
				carry = s / 10;
				System.out.println("sum[k] - "+sum[k]+ " s - "+s+ " carry - "+carry );
				i--;
				k--;
			}
		
			int ans = 0;
		
			// If there is carry on adding 0 index
			// elements append 1 to total sum.
			if (carry == 1)
				ans = 10;
		
			// Converting array into number.
			for ( i = 0; i <= n - 1; i++) {
				ans += sum[i];
				ans *= 10;
				System.out.println("ans - "+ans );
			}
		
			return ans / 10;
		}
		
		// Wrapper Function
		static int calSum(int a[], int b[], int n,
											int m)
		{
			// Making first array which have
			// greater number of element
			if (n >= m)
				return calSumUtil(a, b, n, m);
		
			else
				return calSumUtil(b, a, m, n);
		}
		
		/* Driver program to test above function */
		public static void main(String[] args)
		{
			int a[] = { 9, 3 };
				int b[] = {6,1};
			
				int n = a.length;
				int m = b.length;
			System.out.println(calSum(a, b, n, m));
		}
	}

	// This article is contributed by Gitanjali.


