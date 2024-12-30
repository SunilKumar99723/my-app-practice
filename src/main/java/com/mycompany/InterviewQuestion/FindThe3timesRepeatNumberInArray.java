package com.mycompany.InterviewQuestion;

public class FindThe3timesRepeatNumberInArray {
	
	static void appearsNBy3(int arr[])
    {
		 int max = Integer.MIN_VALUE;
		 System.out.println("max - " +(max+2));//max - ,-2147483648 , -21474836481
		 
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max)
	                max = arr[i];
	        }
	        System.out.println("max value present in array( after condition )- " +max); // o/p - 57
	        int B[] = new int[max + 1];
	        for (int i = 0; i < arr.length; i++) {
	  
	            // increment in array B for every integer
	            // in arr.
	            B[arr[i]]++;
	            
//	            System.out.println(" B[arr[i]]++ --  " +B[arr[i]]++);
	        }
	        for (int i = 0; i <= max; i++) {
	            // output only if element is more than
	            // 1 time in array arr.
	            if (B[i] ==3  )
	                System.out.println(i + "- Present " + B[i]+ " times in Array");
	        }
    }
	public static void main(String[] argrs) {
		

        int arr[] = { 1, 2, 3, 1, 1,5,57,8,5,0,5,7,5,7,2,7 };
        appearsNBy3(arr);

	}
}
