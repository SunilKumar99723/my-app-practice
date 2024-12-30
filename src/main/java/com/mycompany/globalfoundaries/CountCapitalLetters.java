package com.mycompany.globalfoundaries;

public class CountCapitalLetters {

	public static void main(String[] args) {
	String str ="BaBafjfgigk11324@@";
	int upperCase=0,lowerCase=0,number=0,special=0;
	int n= str.length() ;
	for (int i=0;i<n;i++) {
		
		char ch = str.charAt(i);
		
		if(ch>='A' && ch<='Z') {
			upperCase++;
		}
		else if(ch>='a' && ch<='z') {
			lowerCase++;
		}
		else if(ch>='0' && ch<='9') {
			number++;
		}
		else {
			special++;
		}
	}
	  System.out.println("Upper/Capital case letters : " + upperCase);
	  System.out.println("Lower/Capital case letters : " + lowerCase);
	  System.out.println("Number : " + number);
	  System.out.println("Special : " + special);
	}

}
