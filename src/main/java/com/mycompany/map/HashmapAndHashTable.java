package com.mycompany.map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashmapAndHashTable {
	public static void main(String[] argrs) {
		
		HashMap<Integer, String> hm = new HashMap<>();
								 hm.put(1, "Sunil");
								 hm.put(2, "Shruti");
								 hm.put(4, "Shruti");
								 hm.put(3, "Kavita");
								 hm.put(null, null);
								 hm.put(null, "Ba");
								 hm.put(null, "Baba");
								 hm.put(null, "Box");// Only one null key allowed , and last value will print
								 System.out.println("<========= HashMap =========>"); 
								for(Map.Entry<Integer, String>  m : hm.entrySet()) {
									
									System.out.println(" Key : " +m.getKey() + " Value - "+m.getValue());
								}
								
		Hashtable<Integer, String> ht = new Hashtable<>();
								   ht.put(5, "Apple");
								   ht.put(6, "Mango");
								   ht.put(2, "Mango juice");
//								   ht.put(null, "Grapes");// null - key or value not allowed
								   System.out.println("<======== Hashtable =========>"); 
								   for(Map.Entry<Integer, String>  m : ht.entrySet()) {
										
										System.out.println(" Key : " +m.getKey() + " Value - "+m.getValue());
									}
									
	}
}
