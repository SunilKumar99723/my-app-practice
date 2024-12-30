package com.mycompany.Test;

public class StringTest {
	public static void main(String[] argrs) {
		
		String str = " Hi Hello , how are you";
		System.out.println(str);

		System.out.println(str.trim());
		System.out.println(str.replaceAll(" ", ""));
		
		System.out.println(str.toCharArray());
		
		System.out.println(str.charAt(2));

	}
}
