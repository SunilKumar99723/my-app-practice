package com.mycompany.InterviewQuestion;

import java.util.Stack;

public class RemoveDuplicates {
	static String removeDuplicates(String s, int k) {
		   char[] SC = s.toCharArray();
		        int i, j;
		        Stack<Integer> st = new Stack<>();
		        st.add(0);
		        System.out.println("The Stack is: "   + st);
//		        if (!st.isEmpty()) {
//		            st.pop();
//		        }
		        System.out.println("Continuing execution...");
		        for (i = 1, j = 1; j < s.length(); i++, j++) {
		            char chr = SC[i] = SC[j];
		            if (i == 0 || chr != SC[i-1])
		            	st.add(i);
		            else if (i - st.peek() + 1 == k) 
		            	i = st.pop() - 1;
		        }
		        return new String(SC, 0, i);
		    }
	public static void main(String[] argrs) {
		
		String  s = "deeedbbcccbdaa"; 
		int k = 3;
		String str= RemoveDuplicates.removeDuplicates(s, k);
		System.out.println(str);	
	}
}

//Input: s = "pbbcggttciiippooaais", k = 2
//Output: "ps"
//Explanation: 
// first delete "bb" , "gg" ,"tt" ,"ii", "pp","oo","aa" ==> then get "pcciis"
//then delete "cc" and "ii" ===> then get "ps" (output)

//Input: s = "deeedbbcccbdaa", k = 3
//Output: "aa"
//Explanation: 
//First delete "eee" and "ccc", get "ddbbbdaa"
//Then delete "bbb", get "dddaa"
//Finally delete "ddd", get "aa"