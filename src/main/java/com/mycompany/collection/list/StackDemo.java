package com.mycompany.collection.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String args[]) {
		Stack<Integer> st = new Stack<>(); 
		st.add(12);
		st.add(13);
		st.add(14);
		st.add(15);
		st.add(16);
		st.add(17);
		
		System.out.println(" Print stack "+st);
//		for(int x: st.elementAt())
//		int x = (int)st.add(10);
		st.pop().equals(st.get(3));
		System.out.println(" Print stack after pop "+st);	
		
		int ele = 12;
		
			
	}

}
