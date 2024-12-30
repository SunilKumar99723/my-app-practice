package com.mycompany.Test;

import java.util.Arrays;

public class CountCommonCharacters {
	
	public static int countCommonChar(String s1, int lengthofs1, String s2, int lengthOfs2 ) {
		
		int arr1[] = new int[26];
		int arr2[] = new int[26];
		
		Arrays.fill(arr1, 0);
		Arrays.fill(arr2, 0);
		int count=0;
		s2.split(" ");
		for(int i =0; i<lengthofs1;i++) {
			arr1[s1.charAt(i) - 'a']++;
//			System.out.print(" "+arr1[s1.charAt(i) - 'a']++);
		}
		
		System.out.println( "\n new line");
		
		for(int i =0; i<lengthOfs2;i++) {
			arr2[s2.charAt(i) - 'a']++;
//			System.out.print(" "+arr1[s2.charAt(i) - 'a']++);
		}
		for(int i =0; i<26;i++) {
			
			count += (Math.min(arr1[i], arr2[i]));
			System.out.println(((char)(i + 'a')));
		}
		
		
		return count;
		
		
	}
	
	
	
	public static void main(String[] argrs) {
		
		String str= "abcz";
		String str2 = "cbc";
		
//		System.out.println(str2.split(" ").toString());
		
		System.out.println(CountCommonCharacters.countCommonChar(str, str.length(), str2, str2.length()));
		
//		char ch1 ='a';
//		char ch2 ='B';
//		System.out.println((int)ch2);
//		int arr[] = new int[96];
//		Arrays.fill(arr, 0);
//		for(int i =0; i<str.length();i++) {
//			
//			System.out.println(arr[str.charAt(i) - 'a']++);
//		}
//			System.out.println(Math.max(300, 500));	
////Math.min(0, 0);
//		
//		char ch;
//		for(ch = 'A'; ch<'Z';ch++) {
//			
//			System.out.print(" "+ch);
//		}
//		System.out.println();
//		for(ch = 'a'; ch<'z';ch++) {
//			
//			System.out.print(" "+ch);
//		}
	}
}
