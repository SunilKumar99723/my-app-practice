package com.mycompany.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamMap {

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		System.out.println(marks);
			
		//print even number
			List<Integer> l2= marks.stream().map(i->i+2).collect(Collectors.toList());
			System.out.println(l2);

	}

}
