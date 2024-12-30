package com.mycompany.designpattern.singleton;

public class TestSingletonInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	A a1 = A.getAObj();
	A a2 = A.getAObj();
	A a3 = A.getAObj();
	A a4 = A.getAObj();
	
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4.aboutAClass());
	}

}
