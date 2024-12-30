package com.mycompany.Test;

public class FindRepeatedNumber {
	public static void main(String[] argrs) {
		
		int numArray[] = {12, 12, 63, 63, 3,3,4,4,4,5,5,13,13,13};
		
		for (int i=0;i<numArray.length;i++) {
			
			numArray[numArray[i] % numArray.length] = numArray[numArray[i]% numArray.length] + numArray.length;
		}
		
	
		System.out.println(" The repeating elements");
		
		for(int i =0;i<numArray.length; i++) {
			
			if(numArray[i]>= numArray.length*2) {
				System.out.println(i + " " +numArray);
			}
		}

	}
}


//step 1 : First check the repeat number 
//
//step 2 : then check , if the repeat number is more then three times present in array then print that number.
//
//step 3: for that read the array size and compare evey element with each-other and if that number found store it in a varible.
//
//step 4: If the repeat number  
//
