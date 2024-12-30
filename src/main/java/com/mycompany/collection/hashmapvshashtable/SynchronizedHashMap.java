package com.mycompany.collection.hashmapvshashtable;

import java.util.*;

/*
 * 
 * Java HashMap is a non-synchronized collection class. If we need to perform thread-safe operations on it then we must need to synchronize it explicitly. 
 * The synchronizedMap() method of java.util.Collections class is used to synchronize it. 
 * It returns a synchronized (thread-safe) map backed by the specified map. 
 */

public class SynchronizedHashMap {
   public static void main(String[] args) {
   // create HashMap
   Map<String,String> map = new HashMap<String,String>();
       
   // populate the map
   map.put("4","Baba");
   map.put("1","Malay"); 
   map.put("2","Ankit");
   map.put("3","Chintan");
    
   System.out.println("Synchronized map is : "+map);
   
   // create a synchronized map , But HashMap by default it si Un-synchronized
   Map<String,String> syncmap = Collections.synchronizedMap(map);
      
   System.out.println("Synchronized map is : "+syncmap);
   
  
   }
}
