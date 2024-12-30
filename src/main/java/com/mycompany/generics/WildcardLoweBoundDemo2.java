package com.mycompany.generics;

// Java program to demonstrate Lower Bounded Wildcards
//  Syntax: Collectiontype <? super A>
import java.util.Arrays;
import java.util.List;

class WildcardLoweBoundDemo2 {
	
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list)
		{
			System.out.println(list);
		}
	
	public static void main(String[] args)
	{
		// Lower Bounded Integer List
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list1);

		// Number list
		List<Number> list2 = Arrays.asList(4, 5, 6, 7);

		// Integer list object is being passed
		printOnlyIntegerClassorSuperClass(list2);
	}

	
}
