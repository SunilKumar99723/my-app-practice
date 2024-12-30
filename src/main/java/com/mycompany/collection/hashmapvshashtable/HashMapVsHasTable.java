package com.mycompany.collection.hashmapvshashtable;


import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
//fail-safe (Hashtable): iterator doesn't throw any Exception
//fail-fast (HashMap):  iterator throw Exception - java.util.ConcurrentModificationException 
/*
			Hashmap																					Hashtable
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
1.	No method is synchronized.																	1.	Every method is synchronized.
2.	Multiple threads can operate simultaneously and hence hashmap�s object is not thread-safe.			2.	At a time only one thread is allowed to operate the Hashtable�s object. Hence it is thread-safe.
3.	Threads are not required to wait and hence relatively performance is high.					3.	It increases the waiting time of the thread and hence performance is low.
4.	Null is allowed for both key and value.														4.	Null is not allowed for both key and value. Otherwise, we will get a null pointer exception.
5.	It is introduced in the 1.2 version.														5.	It is introduced in the 1.0 version.
6. 	It is non-legacy.																			6.	It is a legacy.
7.  It allows one null key and multiple null values 											7.  It doesn't allow any null key or value
8.  Iterator is fail-fast. 																		8.  Enumerator is not fail-fast
*/
//HashMap 
//allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value
//Iterator in HashMap is fail-fast. But Enumerator in Hashtable is not fail-fast.
public class HashMapVsHasTable {

	public static void main(String[] args) {
		
		//****************************** HASHMAP ****************************************	
		
	//In HashMap all methods are un-synchronized,Iterator in HashMap is fail-fast, so this is not thread safe, but it will be fast compare to Hashtable	
	//no order, can have single null key
	HashMap<String, String> hashMap = new HashMap<>();
	hashMap.put(null, null);
	hashMap.put("Key1", null);
	hashMap.put("Key2", null);
	hashMap.put("Key2z", "Sunil");
	System.out.println("HashMap :" +hashMap);
	
//	We can make the HashMap as synchronized by calling this code
//	Map m = Collections.synchronizedMap(hashMap);
//	System.out.println("HashMap as synchronized :" +m);
	
//	 Iterator in HashMap is fail-fast.
	Iterator<String> itr = hashMap.keySet().iterator();
	while(itr.hasNext()) {
		
		System.out.println("HashMap Iterator :" +itr.next());
		
		// while i am trying to modify hashMap but it gives Exception in thread "main" java.util.ConcurrentModificationException
		// This means iterator will produce exception , if concurrent update are made to the hashmap.
//		hashMap.put("Key5", null);
	}
	
	System.out.println("\n\n");
	
	//****************************** HASHTABLE ****************************************
	
	//In Hashtable all methods are synchronized, so this is thread safe, but it will be slow compare to HashMap
	//null not allowed as a key or value
	//Hashtable is not fail-fast.
	Hashtable<String, String> hashTable = new Hashtable<>();
	hashTable.put("One", "Ek");
	hashTable.put("Five", "Panch");
	hashTable.put("Five", "5");
//	hashTable.put(null, null);// null not allowed as a key or value
	System.out.println("Hashtable :" +hashTable);// you will get NullPointerException
	
	
	// Enumerator in Hashtable is not fail-fast.
	Enumeration<String> en = hashTable.elements();
	
	while(en.hasMoreElements()) 
	{
		System.out.println("hashTable for Enumeration "+en.hashCode()+ " -- " +en.nextElement());
		// Enumerator in Hashtable is not fail-fast.
		hashTable.put("six", "6");
		hashTable.put("seven", "7");
	}
	

	}

}
