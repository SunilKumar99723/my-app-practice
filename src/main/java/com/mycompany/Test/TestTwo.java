package com.mycompany.Test;

public class TestTwo {
	
	String[] str ;
	//condition: more then 2 constructor will not get the compiler error
	 TestTwo(String str, String str2,String ...strings) {
	}
	
	
	public static void main(String[] args) {
		
		TestTwo t1 = new TestTwo();
		TestTwo t2 = new TestTwo("A","B","C");
		TestTwo t3 = new TestTwo("A","B");
		TestTwo t4 = new TestTwo("A");
	}

}
