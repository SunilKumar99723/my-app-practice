package com.mycompany.FiveWaysToCreateObject;

/*1) Java new Operator
This is the most popular way to create an object in Java. A new operator is also followed by a call to constructor which initializes the new object.
While we create an object it occupies space in the heap.
*/
public class Way1NewOperator {
	
	
	String name ="Rajesh";
	
	
	public static void main(String[] args) {
	
	  Way1NewOperator newOperator = new Way1NewOperator();
	  System.out.println(newOperator.name);
	}

}
