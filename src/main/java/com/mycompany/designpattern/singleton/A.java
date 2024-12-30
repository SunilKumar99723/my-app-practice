/**
 * 
 */
package com.mycompany.designpattern.singleton;

/**
 * from singleton class  we are calling factory method
 *
 */
//This is Singleton 
//How to create Singleton design pattern?
//To create the singleton class, we need to have static member of class, private constructor and static factory method.
public class A {  // singleton class

	
	private static A a= new A();
	
	private A() {
		
	}
	static public A getAObj() // factory method 
	{
		return a;
	}
	
	
	public String aboutAClass() {
		
		return "A class creates single instances (Singleton) and you can use this everywhere ";
	}
	

}
