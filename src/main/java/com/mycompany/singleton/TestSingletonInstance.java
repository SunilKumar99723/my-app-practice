package com.mycompany.singleton;

import practice.designpattern.singleton.A;

public class TestSingletonInstance {

	public TestSingletonInstance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 // TODO Auto-generated method stub

	practice.designpattern.singleton.A a1 = practice.designpattern.singleton.A.getAObj();
	practice.designpattern.singleton.A a2 = practice.designpattern.singleton.A.getAObj();
	practice.designpattern.singleton.A a3 = practice.designpattern.singleton.A.getAObj();
	practice.designpattern.singleton.A a4 = A.getAObj();
	
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4.aboutAClass());
	}

}
