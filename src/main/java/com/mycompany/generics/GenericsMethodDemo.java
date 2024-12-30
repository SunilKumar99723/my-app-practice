package com.mycompany.generics;

class NonGenericClass{ 
	
	public static<E> void printArray(E[] allElements) {  // Genirics method but  Non generics class
		
		for(E element : allElements) {
			System.out.println(" Elements present in array : "+element);
		}
		System.out.println();
	} 
}
public class GenericsMethodDemo {
	
	
	public static void main(String[] argrs) {
		
		Integer intArray[] = {22,33,44,55};
		Character charArray[] = { 'B', 'A', 'B', 'A' };  
		System.out.println( "Printing Integer Array" );  
		NonGenericClass.printArray( intArray  );   
		
		 System.out.println( "Printing Character Array" );  
		 NonGenericClass.printArray( charArray );   

	}
}
