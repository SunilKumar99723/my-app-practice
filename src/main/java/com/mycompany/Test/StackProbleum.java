package com.mycompany.Test;
import java.util.Stack;
/*
 * stack implementation in java without using collections
 * 
 * Stack is on LIFO(Last in first out)
 * 
 */
public class StackProbleum {
	private int arr[];
	private int top;
	private int capacity;

// Constructor to initialize the stack
	StackProbleum(int size){
		arr = new int[size];
		capacity = size;
		top=-1;
	}
	
//function to add an element `x` to the stack	
	void push(int x) {
		
		if(isFull()) {
			
			System.out.println(" Overflow terminated");
			System.exit(-1);
		}
		System.out.println(" Inserting " +x);
		arr[++top] = x;
		
		
		
	}
	
//function to pop a top element from the stack	
  int pop() {
	  
	  if(isEmpty()) {
		  
		  System.out.println(" Underflow terminated");
		  
		  System.exit(-1);
		  
	  }
	  System.out.println(" Removing "+peek());
	  
	  return arr[top--];
	  
  }
  
//function to return the top element of the stack	
  int peek() {
	  
	  if(!isEmpty()) {
		  return arr[top];
	  }
	  else
	  {
		  System.exit(-1);
	  }
	  
	  return -1;
  }
  
//function to return the size of the stack
  public int size() {
      return top + 1;
  }
  
//function to check if the stack is empty or not
  public boolean isEmpty() {
	  
	  return top ==-1;
  }
  
  //function to check if the stack is full or not
  public boolean isFull() {
	  
	  return top == capacity -1;
  }
	public static void main(String[] argrs) {
		
		StackProbleum stack = new StackProbleum(5);
		 	stack.push(1);      // inserting 1 in the stack
	        stack.push(2);      // inserting 2 in the stack
	 
	        stack.pop();        // removing the top element (2)
	        stack.pop();        // removing the top element (1)
	 
	        stack.push(3);      // inserting 3 in the stack
	 
	        System.out.println("The top element is " + stack.peek());
	        System.out.println("The stack size is " + stack.size());
	 
	        stack.pop();        // removing the top element (3)
	 
	        // check if the stack is empty
	        if (stack.isEmpty()) {
	            System.out.println("The stack is empty");
	        }
	        else {
	            System.out.println("The stack is not empty");
	        }
		
		
		

	}
}



