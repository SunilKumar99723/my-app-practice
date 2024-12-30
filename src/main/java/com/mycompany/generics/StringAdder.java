package com.mycompany.generics;

public class StringAdder implements Adder<String>{

	@Override
	public String add(String a, String b) {
				return a + b;
	}
	
}
