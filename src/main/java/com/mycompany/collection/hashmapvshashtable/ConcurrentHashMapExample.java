package com.mycompany.collection.hashmapvshashtable;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/*
ConcurrentHashMap is a class which implements the ConcurrentMap interface. It uses Hashtable, underlined data structure. 
As we know, while dealing with thread in our application, HashMap is not a good choice because of the performance issue.
 Hashmap will lock the entire hashmap till the execution of thread t1. 
To resolve this issue, we use ConcurrentHashMap in our application.  
ConcurrentHashMap is thread-safe therefore multiple threads can operate on a single object without any problem. 
In ConcurrentHashMap, the Object is divided into a number of segments according to the concurrency level. 
By default, it allows 16 thread to read and write from the Map without any synchronization. 
In ConcurrentHashMap, at a time any number of threads can perform retrieval operation but for updating in the object,
the thread must lock the particular segment in which the thread wants to operate. This type of locking mechanism is known as Segment locking or bucket locking. 
Hence, at a time 16 update operations can be performed by threads.

- It does not allow duplicate keys. 
� It does not allow null to be used as a key or value.

Why HashMap is faster than ConcurrentHashMap?

	HashMap performance is relatively high because it is non-synchronized in nature and any number of threads can perform simultaneously.
	But ConcurrentHashMap performance is low sometimes because sometimes Threads are required to wait on ConcurrentHashMap

Is ConcurrentHashMap better than HashMap?

	It will throw NullPointerException. HashMap is faster. ConcurrentHashMap is slower than HashMap
	
What happens if two nulls stored in HashMap?
	Yes, HashMap allows null key and null values. 1.2) 
	 HashMap allows to store one null key and many null values i.e. many keys can have null value in java.
	 
*/

public class ConcurrentHashMapExample {
	
	static boolean replaceWithKeyAndValue(  ConcurrentHashMap<Integer, String>  chmap) {
		
		 if (chmap.containsKey(6) && chmap.get(6).equals("Sugarcane")) {
			 chmap.put(6, "Guava");
			 System.out.println("Replaced");
	            return true;
	        } else return false;
		}
	
	public static void main(String[] argrs) {
		
		
		 // create an instance of ConcurrentHashMap
        ConcurrentHashMap<Integer, String> chmap
            = new ConcurrentHashMap<Integer, String>();
        
        
        chmap.put(1,"Mango");
        chmap.put(2,"Apple");
        chmap.put(3,"Pineapple");
        chmap.put(8,"Raspberry");
        chmap.put(4,"Watermelon");
        chmap.put(6,"Sugarcane");
        chmap.put(5,"Banana");
        chmap.put(7,"Papaya");
       //chmap.put(9,null); // not allowed , will give Exception in thread "main" java.lang.NullPointerException
       //chmap.put(null,"grapes");// not allowed , will give Exception in thread "main" java.lang.NullPointerException
        
        System.out.println("ConcurrentHashMap --- "+chmap);
     // Create an Iterator over the
        // ConcurrentHashMap
        Iterator<ConcurrentHashMap.Entry<Integer, String> >     itr = chmap.entrySet().iterator(); 
        
        
        // The hasNext() method is used to check if there is
        // a next element and the next() method is used to
        // retrieve the next element
        while (itr.hasNext()) {
        	
            ConcurrentHashMap.Entry<Integer, String> entry   = itr.next();
            
            System.out.println("Key = " + entry.getKey() + ", Value = "  + entry.getValue());
        }

        
      ConcurrentHashMapExample.replaceWithKeyAndValue(chmap);     
        System.out.println("Replaced --- "+chmap);
	}
}
