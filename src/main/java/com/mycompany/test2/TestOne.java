package com.mycompany.test2;

import java.io.IOException;

public class TestOne {
	
	
	static void printCommonCharacter(String Str1 , String str2){
		final int MAX_CHAR= 26;
		int[] a1 = new int[MAX_CHAR];
		int[] a2 = new int[MAX_CHAR];
		
		int lengthStr1 = Str1.length();
		int lengthStr2 =  str2.length();
		
			for(int i =0; i<lengthStr1;i++ ) {
			
			a1[Str1.charAt(i) -'a'] += 1;
	}
			for(int i =0; i<lengthStr2;i++ ) {
			
			a2[str2.charAt(i) -'a'] += 1;
			}
			
			System.out.println("Print common Charecter : ");
			for (int i=0 ; i<26;i++)
			{
				if((a1[i] != 0) && (a2[i] != 0))
//				{
					
					for(int j=0; j< Math.min(a1[i], a2[i]); j++ ) {
//						System.out.println((char)(i));
						
						System.out.print(((char)(i + 'a')));
					}
//				}
			}
		
	}
	
	
	public static void main(String[] argrs) throws IOException {
		 
		// Two string : Str1 = "ABCD" str2: "CDEF"
		String  Str1 = "abcD", str2= "Def"  ; 
		
		printCommonCharacter(Str1.toLowerCase(), str2.toLowerCase());

	}
}
