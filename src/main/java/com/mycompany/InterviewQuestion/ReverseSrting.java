package com.mycompany.InterviewQuestion;

public class ReverseSrting {
	public static void main(String[] argrs) {

		String  str = "RaB" , revStr= "";
		
		for(int i=0;i<str.length();i++) {
			
			char c= str.charAt(i); //extracts each character
//			 System.out.println("char -- "+c);
		    revStr = c+ revStr; //adds each character in front of the existing string
				
		    System.out.println("Reverse -- "+revStr);
		
		}
	}
}
