package com.mycompany.test2;

import java.util.Stack;

public class BalancedParanthesisTest {
	
   static boolean	parenthesisBalanced(String str){
		
//		String str = "{{}}";
	Stack<Character> st = new Stack<>();
		for(int i = 0; i<str.length();i++) {
		if(str.charAt(i) == '{' || str.charAt(i) == '['   ) {
			
			st.push(str.charAt(i));
			continue;
			
		}
		  // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
		if(st.empty()) 
			
			return false;
		
					char check;
					
					switch(str.charAt(i)) {
					
					case ')':
						check = st.pop();
						if(check =='{' || check == '[')
							return false;
						break;
					case '}':
						check = st.pop();
						if(check =='(' || check =='[' )
							return false;
							break;
					case ']':
						 check = st.pop();
						if(check =='{' || check == '(')
							return false;
							break;
												
						}	
		}
		return (st.isEmpty()); // Check empty stack
	}
	
	
	
	public static void main(String[] argrs) {
		
		String str ="{}[";
		
		if(parenthesisBalanced(str)) {
			System.out.println(" Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
		

	}
}
