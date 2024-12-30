package com.mycompany.test2;

public class ReverseTheStr {
	public static void main(String[] argrs) {
		
		String  Str= "i am working for oracle";
		
		int lengthOfString =Str.length();
		
		String rev = " ";
		
	    char ch ;
		
		
		for(int i =0; i<lengthOfString;i++) {
			
			 ch = Str.charAt(i);
			 rev = ch + rev;
		}	
	
		System.out.println("reverse -" +rev);
	}
}
