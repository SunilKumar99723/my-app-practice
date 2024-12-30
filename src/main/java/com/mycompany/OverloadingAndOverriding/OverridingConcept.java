package com.mycompany.OverloadingAndOverriding;
//The runtime polymorphism can be achieved by method overriding.

// Can we override static , final methods? Answer- No
//overriding is possible with same class ?  ans - No, you cannot override the same method in one class.

class Parent{
	
	public  void display() { //we can override the display() method, Answer - N
		System.out.println("Parent");
	}
	public static void play() { //we cannot override the play() (Static)method, Answer - No  
		System.out.println("Parent Play ");
	}
}

class Child extends Parent{
	public  void display() {
		System.out.println("Child");
	}
	
	public static void play() {
		System.out.println("Child Play ");
	}
	
}
public class OverridingConcept {
	public static void main(String[] args) { // You cannot override static methods and since the public static void main() method is static we cannot override it.
		
		Parent p1 = new Child();
		p1.display();
		p1.play();
//		Child.display();
//		Child.play();
	}
}

