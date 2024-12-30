package com.mycompany.exceptionHandling;

public class ArithmeticException {
	int a = 0, b = 10;

	void hobbies() {

		try {

			{
				int c = b / a;
				System.out.println("score  " + c);
				// System.out.println("playing cricket");
				
				//System.exit(0);// In this scenario Finally block will not execute
			}

		} catch (Exception ex) {

			System.out.println("Error--  " + ex);
			System.exit(0);// In this scenario Finally block will not execute
		}

		
		  finally { 
			  System.out.println("finally playing cricket");
		  
		  }
		 
	}

	public static void main(String[] args) {

		ArithmeticException s = new ArithmeticException();
		s.hobbies();
	}
}
