package com.mycompany.finalVsFinallyVsFinalize;

/*
 * Ponts :
 * 1. Finally block will always be associate with TRY- FINALLY , TRY-CATCH-FINALLY , You cannot write only finally block.
 * 2. Whatever you open in Try block , that should/will close in the Finally block , and then it clean the memory
 */
public class FinallyBlockEx {
	

	public static void main(String[] args) {
		
		
		//int[] arr = new int[4];
	try {
		//int i = arr[4];
		System.out.println(" Try");
	}
	
//	catch(ArrayIndexOutOfBoundsException ex){
//		System.out.println("Exception");
//		}
	
	finally {// Always Execute , Here, Mostly Clean up code will be present like close - Pstmt, conn, 
		
		// Close the connection, Cleaned the GC
		
		System.out.println("Finally block always executed ");
}
}

}
