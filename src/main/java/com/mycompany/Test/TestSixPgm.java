package com.mycompany.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TestSixPgm {
	
	static class Stack{
		 Queue<Integer> q1 = new LinkedList<Integer>();
		 Queue<Integer> q2 = new LinkedList<Integer>();
	
		static int curr_size;
		Stack(){
		curr_size =0;	
		}
		
		 void push(int x) {
			curr_size++;
			
			q2.add(x);
			
			while(!q1.isEmpty()) {
				q2.add(q1.peek());
				q1.remove();
			}
			Queue<Integer> q = q1;
			q1=q2;
			q2=q;
		}
		 void pop()
		{
			if(q1.isEmpty())
				return;
			q1.remove();
			curr_size --;
		}
		
		 int top()
		{
			if(q1.isEmpty())
				return -1;
			return q1.peek();
		}
		 int size()
		{
			return curr_size;
		}
		
		}
	
	
	public static void main (String[] args) {
		
	 Stack st = new Stack();
	 st.push(10);
	 st.push(20);
	 st.push(30);
	 st.push(40);
	 st.push(50);
	 st.push(60);
//	 
	 System.out.println("Initial Size - " + st.size());
	 System.out.println("Before pop -"+st.top());
	 st.pop() ;
//	 st.pop();
	 System.out.println("After pop -"+st.top());
	 System.out.println("current  Size - " + st.size());
	 
	}

}
