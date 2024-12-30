package com.mycompany.generics;

public class AdderMain {
	public static void main(String[] argrs) {

		System.out.println(new StringAdder().add("Hello", "World"));
		System.out.println(new IntegerAdder().add(1, 2));
	}
}
