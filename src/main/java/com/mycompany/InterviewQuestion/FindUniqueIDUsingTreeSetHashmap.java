package com.mycompany.InterviewQuestion;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class FindUniqueIDUsingTreeSetHashmap {
	
	//Comparator should compare based on values and then based on the keys.
	 public static Map<Engineer, Object> distinctEnggIDHashMapByValues(Map<Engineer, String> hashmap) {
		 
	       // Insert all key-value pairs into TreeMap using a custom comparator.
	       TreeMap<Engineer, Object> treeMap = new TreeMap<>((Engineer o1,Engineer o2) -> {
	    	   	return o1.getEnggID().compareTo(o2.getEnggID());  	   
	       });
	       treeMap.putAll(hashmap);
		return treeMap;
	}

public static void main(String[] args) {
	
	Map<Engineer,String> hm = new HashMap<Engineer,String>();

	hm.put(new Engineer("11","Anil",5000),"Civil");
	hm.put(new Engineer("11","Ajay",6000),"IT");
	hm.put(new Engineer("12","Vikash",6000),"Automobile");
	hm.put(new Engineer("12","Ram",6000),"Environmental");
	hm.put(new Engineer("12","Rakesh",6000),"Electrical");
	hm.put(new Engineer("12","Pushpa",6000),"Mechanical");
	
	 Map<Engineer, Object> distinctEnggID = distinctEnggIDHashMapByValues(hm);
	 
     System.out.println("Values after sorting : " +distinctEnggID );
     //Print Vertically
     for (Engineer key : distinctEnggID.keySet()) {
    	    System.out.println(key + " = " + distinctEnggID.get(key));
    	}

}
}
