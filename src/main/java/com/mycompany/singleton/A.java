/**
 * 
 */
package com.mycompany.singleton;

/**
 * from singleton class  we are calling factory method
 *
 */
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
