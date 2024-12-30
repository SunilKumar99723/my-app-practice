package com.mycompany.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//	import com.google.common.collect.ArrayListMultimap;
//	import com.google.common.collect.Multimap;

	public class SingleKeyMultipleValue {

	    public static void main(final String[] args) {

	       HashMap<String,List<String> > hashMap = new HashMap<String, List<String> >();
	       
	       // Create list one and store the value
	       List<String> listOne = new ArrayList<String>();
	       listOne.add("Sunil");
	       listOne.add("Amit");
	       listOne.add("Vishal");
	       
	       // Create list Two and store the value
	       List<String> listTwo = new ArrayList<String>();
	       listTwo.add("Shruti");
	       listTwo.add("Ram");
	       listTwo.add("Rahim");
	       
	       // Create list three and store the value
	       List<String> listThree = new ArrayList<String>();
	       listThree.add("Shruti");
	       listThree.add("Ram");
	       listThree.add("Rahim");
	       
//	       put value into hashmap 
	       hashMap.put("A", listOne);
	       hashMap.put("B", listTwo);
	       hashMap.put("C", listThree);
	       
	       System.out.println("Hash Map contains --- "+hashMap);
	       
	       System.out.println("  Fetch keys and there values(Multiple) ");
	       
	       for (Map.Entry<String, List<String>> entry : hashMap.entrySet()) {
	    	  String key = entry.getKey();
	    	  List<String> values = entry.getValue();
	    	  
	    	  System.out.println("Key --- "+key+ "  , Values -- "+values);
	       }
	    }

	}