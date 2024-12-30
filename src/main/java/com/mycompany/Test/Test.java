package com.mycompany.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test {
	public static void main(String[] argrs) {
		
		Map<String,String> map = new HashMap<>();
		map.put("Fruit1", "Mango");
		map.put("Fruit2", "Apple");
		map.put("Fruit3", "Banana");
		map.put("Fruit4", "Grapes");
		
		System.out.println(" data -" +map);
		
		Set<Entry<String, String>> itr = map.entrySet();
		
		for (Entry<String, String> x :itr) {
			
			System.out.println(" Fruit Name -"+x.getValue());
			
			
		}
		
//		map.forEach(null);
		
		

	}
}
