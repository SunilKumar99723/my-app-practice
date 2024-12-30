package com.mycompany.tightcoupling;

//Java program to illustrate 
//tight coupling concept 

/*Explanation: In the Below program the Subject class is dependents on Topic class. In the above program 
Subject class is tightly coupled with Topic class it means if any change in the Topic class requires Subject class to change.
For example, if Topic class understand() method change to gotit()
method then you have to change the startReading() method will call gotit() method instead of calling understand() method.
*/

class Topic { 
	public void understand() 
	{ 
		System.out.println("Tight coupling concept"); 
	} 
} 


class Subject { 
	
	Topic t = new Topic(); 
	public void startReading() 
	{ 
		t.understand(); 
	} 
	public static void main(String args[]) {
		Subject sb = new Subject();
		sb.startReading();
	}
} 
