package com.mycompany.Test;

import java.util.Random;

public class GenerateRandomNumber {
	private static final Random generator = new Random();
	 
	
	//Using Java 8 - method that generates a stream of 5 integers between 1 to 10  
		public static void generateRandomBetween(int NumToGenerate, int origin, int bound ) {
			
			Random random1 = new Random();
			random1.ints(NumToGenerate,origin,bound).forEach(System.out::println);  
			
		}
		
		//Using Java 8 - method that generates a stream of integers having size 5  
		public static void generateRandomNumberWithSize(int numberSize ) {
			
			Random random = new Random();
			random.ints(numberSize).forEach(System.out::println);  
		}
		
		
		// Using Java 7+ - generate 6 digit random Number
		public static String getRandomNumberString() {
		    // It will generate 6 digit random Number.
		    // from 0 to 999999
		    Random rnd = new Random();
		    int number = rnd.nextInt(999999);

		    // this will convert any number sequence into 6 character.
		    return String.format("%06d", number);
		}
		
		//Using Java 7+ -generate 6 digit random Number.
		public static int  generatePin() {
		    return 100000 + generator.nextInt(900000);
		}
		
	public static void main(String[] args) {
		generateRandomBetween(5,1,10);
		generateRandomNumberWithSize(3);
		
		// Before Java 8
		Random random = new Random();   
		// Generates random integers 0 to 49  
		int x = random.nextInt(50);   
		// Generates random integers 0 to 999  
		int y = random.nextInt(1000);   
		// Prints random integer values  
		System.out.println("Randomly Generated Integers Values");  
		System.out.println(x);   
		System.out.println(y); 
		
		System.out.println("generate 6 digit random Number - ");  
		System.out.println(getRandomNumberString());
		System.out.println(getRandomNumberString());
		
		System.out.println(generatePin());
		
	}

}
