package com.mycompany.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		System.out.println(l);
			
		//print even number
			List<Integer> l2= l.stream().filter(i->i%2==0).collect(Collectors.toList());
			System.out.println(l2);
	}
}