package com.mycompany.Test;

public class ReverseTheStr {
	
	// Using Recursion
	static void reverse(String str) 
    {
		
        if ((str==null)||(str.length() <= 1))
           System.out.println(str);
        else
        {
            System.out.print(str.charAt(str.length()-1));
            reverse(str.substring(0,str.length()-1));
        }
    }
		
	static void reverseString(String Str) {
	int lengthOfString =Str.length();
		String rev = "";
	    char ch = 0 ;
		for(int i =0; i<lengthOfString;i++) {
			 ch = Str.charAt(i);
			 rev = ch + rev;
		}	
		System.out.println(rev);
	}
	
	
	public static void main(String[] argrs) {
		
		String  str= "BiG Bang";
		System.out.println(	str.substring(0,6-1));
		
		System.out.print("Recursion reverse : ");
		reverse(str);
		
		System.out.print("Normal reverse : ");
		reverseString(str);
}
	
}
