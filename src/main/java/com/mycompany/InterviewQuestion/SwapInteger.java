package com.mycompany.InterviewQuestion;

public class SwapInteger {

	public static void main(String[] args) {
		 {
		        int x = 5, y = 10;
		        int a = 10, b = 15;
//		       way 1
		        a = a * b / (b = a);
//		       way 2
		        b = (a + b) - (a = b);
//		       way 3
		        x = x ^ y ^ (y = x);
		      
		        System.out.println( "After Swapping values"+" of x and y are " + x + " " + y);
		        System.out.println( "After Swapping values"+" of a and b are " + a + " " + b);
		    }

	}

}
