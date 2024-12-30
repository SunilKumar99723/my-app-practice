package com.mycompany.finalVsFinallyVsFinalize;
/* points:
 * 1. Finalize is a method, which is available in object class (Which is super class)
 * 2. The purpose of finalize method is to release the resources that is allocated by unused object 
 * 
 */
public class FinalizeMethodGarbageEx {

	public void finalize() {
		System.out.println("Garbage collection clean/unallocate the unused object - g1 & g2");
	}
	
	public static void main(String[] args) {
		FinalizeMethodGarbageEx g1 = new FinalizeMethodGarbageEx();
		FinalizeMethodGarbageEx g2 = new FinalizeMethodGarbageEx();
		
		g1 = null;// If you will comment this line Finalize method will not call for g1 obj;
		g2 = null;
		System.gc();
	}
}
