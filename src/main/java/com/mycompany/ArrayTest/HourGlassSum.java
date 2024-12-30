package com.mycompany.ArrayTest;

//Java program to find maximum 
//sum of hour glass in matrix
import java.io.*;

class HourGlassSum {
	
//static int R = 5;
//static int C = 5;

//Returns maximum sum of 
//hour glass in ar[][]
static int findMaxSum(int [][]mat)
{
//	if (R < 3 || C < 3)
//		return -1;

	// Here loop runs (R-2)*(C-2) 
	// times considering different
	// top left cells of hour glasses.
	int max_sum = Integer.MIN_VALUE;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			// Considering mat[i][j] as top 
			// left cell of hour glass.
			int sum = (mat[i][j] + mat[i][j + 1] + 
					mat[i][j + 2]) + (mat[i + 1][j + 1]) + 
					(mat[i + 2][j] + mat[i + 2][j + 1] + 
					mat[i + 2][j + 2]);

			// If previous sum is less then 
			// current sum then update
//			// new sum in max_sum
//			   if (sum > max_sum)
//               {
//				   max_sum= sum;
//               }
//
//           else if (max_sum > sum)
//		       {
//    	            max_sum= max_sum;
//		       }
//		         else
//		       {
//		        	 max_sum= max_sum;
//		       }
			
//			or 
			max_sum = Math.max(max_sum, sum);
		}
	}
	return max_sum;
}

	// Driver code
	static public void main (String[] args)
	{
		int [][]mat = {{1, 2, 3, 0, 0},
					{0, 0, 0, 0, 0},
					{2, 1, 4, 0, 0},
					{0, 0, 0, 0, 0},
					{1, 1, 0, 1, 0}};
		int res = findMaxSum(mat);
		if (res == -1)
			System.out.println("Not possible");
		else
			System.out.println("Maximum sum of hour glass = "
								+ res);
	}
	
}



