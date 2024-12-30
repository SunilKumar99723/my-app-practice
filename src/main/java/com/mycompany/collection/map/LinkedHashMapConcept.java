package com.mycompany.collection.map;

//Points to remember
//Java LinkedHashMap contains values based on the key.
//Java LinkedHashMap contains unique elements.
//Java LinkedHashMap may have one null key and multiple null values.
//Java LinkedHashMap is non synchronized.
//Java LinkedHashMap maintains insertion order.
//The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
	import java.util.*;  
	class LinkedHashMapConcept{  
	 public static void main(String args[]){  
	   
	  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(100,"Sunil"); 
	  hm.put(101,"Vijay");  
	  hm.put(102,"Rahul"); 
	  hm.put(90,"Amit");  
	  hm.put(23,"Vijay");  
	  hm.put(11,"Rahul");  
	  
//	for(Map.Entry m:hm.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  } 
	  System.out.println("Keys: "+hm.keySet());  
	  //Fetching key-value pair  
      System.out.println("Key-Value pairs: "+hm.entrySet());  
	 }  
	} 