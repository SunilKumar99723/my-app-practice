package com.mycompany.stringExample;

public class StringEqualOrCompare {

	public static void main(String[] args) {
		String s1="hello"; 
		String s2="hello"; 
		String s3="hi";
		String s4= new String("hello");
		String s6=s4.intern();
		
		System.out.println("s6  "+s6); 
		
		System.out.println("s1.equalsIgnoreCase(s2) "+s1.equalsIgnoreCase(s2));   // returns true
		System.out.println("s1.equalsIgnoreCase(s3) "+s1.equalsIgnoreCase(s3));   // returns false
	    //"==" compare the reference
		System.out.println("s1==s4 "+(s1==s4)); // returns false
		System.out.println("s1==s2 "+(s1==s2));
		//s1.equals(s4) will compare the value
		System.out.println("s1.equals(s4) "+s1.equals(s4)); // returns true
	}

}
