package com.mycompany.MultithreadExample2;

public class MainClass {
	public static void main(String[] argrs) {
		Company comp = new Company();
		Producer p = new Producer(comp);
		Consumer c = new Consumer(comp);
		p.start();
		c.start();
		

	}
}
