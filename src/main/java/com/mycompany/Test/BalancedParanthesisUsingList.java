package com.mycompany.Test;

import java.util.ArrayList;
import java.util.List;


public class BalancedParanthesisUsingList {
	
	static boolean checkParenthesisBalanced(String exp) {
		
		List<Character> list = new ArrayList<Character>();
		
		for(char c: exp.toCharArray())
		{
			if(c=='{' || c=='[' || c=='(') {
				list.add(0,c);
			}else {
				if(list.isEmpty()) {
					return Boolean.FALSE;
				}
				char tmpFromList = list.get(0);
				
				// now check the balanced , If balanced parenthesis , removed from list
				if((c==')' && tmpFromList =='(') || (c=='}' && tmpFromList =='{') || (c==']' && tmpFromList =='[')) {
					
					list.remove(0);
					
				} else
				{
					return Boolean.FALSE;
				}
				
			}
			
		}
		if(!list.isEmpty()) {
			
			return Boolean.FALSE;
		}
		return Boolean.TRUE;
		
	}
	public static void main(String[] argrs) {
	 boolean result =	checkParenthesisBalanced("{}{}{");
	 System.out.println(" Result -- " +result );
	}
}
