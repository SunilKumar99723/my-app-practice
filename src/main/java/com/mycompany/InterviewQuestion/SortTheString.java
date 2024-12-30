package com.mycompany.InterviewQuestion;

public class SortTheString {
	public static void main(String[] argrs) {
		
		SortTheString sort = new SortTheString();
		String str = "BABA";
		sort.sortString(str);
		
	}
	

	public void sortString( String str) {
		
		char temp = 0;
		char[] chars = str.toCharArray();
		for(int i =0; i<chars.length;i++)
		{
			for(int j=0;j<chars.length;j++) {
				
				if(chars[j]>chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j]= temp;
				}
			}
		}
		
		System.out.println(" Sorted String ");
		
		for(int i =0; i<chars.length;i++)
		{
			System.out.print(chars[i]);
		}
	}

}
