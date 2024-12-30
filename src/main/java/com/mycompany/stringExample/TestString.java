package com.mycompany.stringExample;

public class TestString {
	
	static void toPrintCharwithIndex(String str1) {
		Character ch =  null;
		int lengthOfStr = str1.length();
		for(int i=0; i<lengthOfStr; i++) {
			 ch = str1.charAt(i);
			
			System.out.println("Index at - " +i+ " Char -- " +ch);
		}
//	System.out.println("ch - " +ch);
	}	
		
  static void printRepeatCharacter(String str) {
	  
	  char[] ch = str.toCharArray();     //Converts given string into character array  
	  int StrLength = str.length();
	  int count;
	  System.out.println("Duplicate charecter in given string :"); 
	  for(int i =0 ; i<StrLength;i++) {
		  count =1;	 
		  
		  for(int j=i+1; j<StrLength; j++) {
			  
			  if(ch[i] == ch[j] && ch[i] != ' ')
			  {
				  count++;
				  ch[j]='0';  
			  }
			    //Set ch[j] to 0 to avoid printing visited character  
//			  System.out.println();
		  }
		  
		  if(count>1 && ch[i] !='0') {
			  System.out.println(i+"--"+ch[i]);  
		  }
		  }
	  
  }
	
	
	@SuppressWarnings("null")
	public static void main(String[] argrs) {

		String str1= "Babafgfdg";
		toPrintCharwithIndex(str1);
		printRepeatCharacter(str1);
}
}