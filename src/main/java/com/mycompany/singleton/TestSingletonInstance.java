package com.mycompany.singleton;

public class TestSingletonInstance {

	public TestSingletonInstance() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		com.mycompany.singleton.A a1 = com.mycompany.singleton.A.getAObj();
		com.mycompany.singleton.A a2 = com.mycompany.singleton.A.getAObj();
		com.mycompany.singleton.A a3 = com.mycompany.singleton.A.getAObj();
		com.mycompany.singleton.A a4 = com.mycompany.singleton.A.getAObj();

//	practice.designpattern.singleton.A a1 = practice.designpattern.singleton.A.getAObj();
//	practice.designpattern.singleton.A a2 = practice.designpattern.singleton.A.getAObj();
//	practice.designpattern.singleton.A a3 = practice.designpattern.singleton.A.getAObj();
//	practice.designpattern.singleton.A a4 = A.getAObj();
	
	
	System.out.println(a1);
	System.out.println(a2);
	System.out.println(a3);
	System.out.println(a4.aboutAClass());
	}

}
