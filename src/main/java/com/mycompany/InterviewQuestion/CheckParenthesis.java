package com.mycompany.InterviewQuestion;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckParenthesis {
	public static void main(String[] argrs) {
		
		String strExp ="{()}";
		
		if(checkValidation(strExp))
		{
		  System.out.print(true);
		}
		else
		System.out.print(false);
	}
	
	
	static boolean checkValidation(String strExp){
		
		/*
		 * Deque interface in Java : The Deque interface present in java.util package is
		 * a subtype of the queue interface. The Deque is related to the double-ended
		 * queue that supports addition or removal of elements from either end of the
		 * data structure. It can either be used as a queue(first-in-first-out/FIFO) or
		 * as a stack(last-in-first-out/LIFO). Deque is the acronym for double ended
		 * queue.
		 */
		Deque<Character> stack = new ArrayDeque<Character>();

		for(int i=0; i<strExp.length();i++)
		{
		   char ch = strExp.charAt(i);
		   
		   if(ch== '(' || ch == '[' || ch== '{')
		   {
		     stack.push(ch);
		     continue;
		   }

		if ( stack.isEmpty()){

		  return false;
		}
		char check;

		switch (ch)
		{
		  case ')' : check = stack.pop();
		             if( check =='{' || check == '[')
					 return false;
					 break;
					 
		  case '}' : check = stack.pop();
		            if( check =='(' || check == '[')
					return false;
					break;
					 
		  case ']' : check = stack.pop();
		            if( check =='(' || check == '{')
					return false;
					break;
		}

		}
		return (stack.isEmpty());

		}

}
