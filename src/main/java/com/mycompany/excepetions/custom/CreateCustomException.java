package com.mycompany.excepetions.custom;

public class CreateCustomException {
	
	static void validateAge(int age) throws AgeLessThanZeroException {
		 
		if(age>0) {
			System.out.println(" Valid age ");
		}
		else {
			
			throw new AgeLessThanZeroException(" age can't be zero or less than zero - "+age);
		}

		
	}
	
	public static void main(String[] argrs) throws AgeLessThanZeroException {
		
		validateAge(0);
	}
}
