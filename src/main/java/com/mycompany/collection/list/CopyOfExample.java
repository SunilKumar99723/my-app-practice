package com.mycompany.collection.list;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.runtime.NameList;

// Java 10-  List.copyOf(), Set.copyOf() And Map.copyOf() Methods


public class CopyOfExample {
	
	public static void main(String[] argrs)
	{
		List<String> nameList = new ArrayList<String>();
		nameList.add("Sunil");
		nameList.add("Baba");
		nameList.add("Tiger");
		nameList.add(null); // not possible 
		
		System.out.println(nameList);	// here "null" value will print 
		
		List<String> immutableNameList = List.copyOf(nameList); // whenever you want to create immutable value, use "copyOf()" . Here,  Null value not allowed
		
//		doNotChange(immutableNameList);
		// Before adding "Bablu"
		System.out.println(immutableNameList);
		
		nameList.add("Bablu"); //  //It gives no error, but it will not be reflected in immutableNameList
		
		// After adding "Bablu", it will not display
		System.out.println(immutableNameList);
	}

	private static void doNotChange(List<String> immutableNameList) {
		// TODO Auto-generated method stub
		immutableNameList.add("ShouldNotAllowed");  // //It gives run-time error : UnsupportedOperationException
		
	}
}
