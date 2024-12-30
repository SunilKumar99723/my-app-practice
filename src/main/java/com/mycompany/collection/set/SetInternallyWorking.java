package com.mycompany.collection.set;

import java.util.*;   

/*
set will never contain duplicate elements

*/
enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };
public class SetInternallyWorking{     
    public static void main(String[] args)     
    {     
        // creating LinkedHashSet implementation using the Set    
        Set<String> marvel_movies = new LinkedHashSet<String>();     
      
        boolean b1=    marvel_movies.add("Captain Marvel");  
        boolean b2=    marvel_movies.add("Thor: Ragnarok");     
        boolean b3=    marvel_movies.add("Captain America: The Winter Soldier");     
        boolean b4=    marvel_movies.add("Ant-Man and the Wasp");  
       
        
        // adding duplicate element
        boolean b5=   marvel_movies.add("Thor: Ragnarok"); // Duplication not allowed
        boolean b6=   marvel_movies.add("Captain Marvel"); // Duplication not allowed
          
        // printing b1, b2, b3
        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        System.out.println("b4 = "+b4);
        System.out.println("b5 = "+b5); //false
        System.out.println("b6 = "+b6); //false
      
        System.out.println(marvel_movies);   
        
        
     // Declaring a string
        String check = "Captain America: The Winter Soldier";
        // Check if the above string exists in
        // the SortedSet or not
        // using contains() method
        System.out.println("Contains " + check + " present or not (TRUE/FALSE) - " + marvel_movies.contains(check));
       
        //Removing the element
        String removeElement = "Captain Marvel";
        marvel_movies.remove(removeElement);
        System.out.println("After removing element " + marvel_movies);
        
     // Iterating through the Elements
        // Iterating through the Set
        // via for-each loop
        System.out.println("*****Iterating through the Set via for-each loop *******");
        for (String value : marvel_movies)
          // Printing all the values inside the object
            System.out.print(value + ", ");
         
        System.out.println();
        
       
        System.out.println("<<---------Iterating through iterators-  marvel_movies.iterator()------>>");
        // Iterating through iterators
        Iterator<String> i = marvel_movies.iterator();
 
        System.out.println("Iterating through iterators - ");
        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext()) {
            System.out.println(i.next());
        	}
        
        
        
	     // creation of the set object
	     // using the EnumSet class
//        enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ };
        // Creating a set
        Set<Gfg> set1;
        
        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,Gfg.LEARN, Gfg.CODE);
        System.out.println("Set 1: " + set1);
        
     
        
     // creation of Set object using
     // the LinkedHashset class
        System.out.println("=======================LinkedHashSet ======================");
        Set<String> hindMovies = new LinkedHashSet<String>();
        hindMovies.add("Nayak");
        hindMovies.add("RRR");
        hindMovies.add("KGF2");
        hindMovies.add("The Kashmir Files");
        hindMovies.add("MS DHONI");
        
        // Displaying the LinkedHashSet
        System.out.println(hindMovies);
 
        // Removing items from LinkedHashSet
        // using remove()
        hindMovies.remove("Nayak");
        System.out.println("Set after removing "
                           + "Australia:" + hindMovies);
 
        // Iterating over linked hash set items
        System.out.println("Iterating over linked hash set items:");
        Iterator<String> itr = hindMovies.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
        
        /*
        TreeSet :
        Objects are stored in sorted, ascending order.  It stores elements in a sorted format.
        But we can iterate in descending order using the method TreeSet.descendingIterator(). Let�s see how to create a set object using this class.
        */
        System.out.println("=======================TreeSet ======================");
        Set<String> ts = new TreeSet<String>();
        
        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("South Africa");
        ts.add("Pakistan");
        ts.add("America");
 
        // Adding the duplicate
        // element
        ts.add("India");
 
        // Displaying the TreeSet
        System.out.println(ts);
 
        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                           + "Australia:" + ts);
 
        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> itrTreeSet = ts.iterator();
 
        while (itrTreeSet.hasNext())
            System.out.println(itrTreeSet.next());

        
    }     
}  

/*
Internal working of Set/HashSet in Java

Now from the output, it is clear that when we try to add a duplicate element to a set using add() method, it returns false, and element is not added to hashset, as it is already present. Now the question comes, how add() method checks whether the set already contains the specified element or not. It will be more clear if we have a closer look on the add() method and default constructor in HashSet class.

//predefined HashSet class
public class HashSet
{
 // A HashMap object 
 private transient HashMap map;

 // A Dummy value(PRESENT) to associate with an Object in the Map
 private static final Object PRESENT = new Object();
 
 // default constructor of HashSet class
 // It creates a HashMap by calling 
 // default constructor of HashMap class
 public HashSet() {
     map = new HashMap<>();
 }

 // add method 
 // it calls put() method on map object
 // and then compares it's return value with null
 public boolean add(E e) {
     return map.put(e, PRESENT)==null;
 }

 // Other methods in Hash Set
}
Now as you can see that whenever we create a HashSet, it internally creates a HashMap and if we insert an element into this HashSet using add() method, it actually call put() method on internally created HashMap object with element you have specified as it�s key and constant Object called �PRESENT� as it�s value. So we can say that a Set achieves uniqueness internally through HashMap. Now the whole story comes around how a HashMap and put() method internally works.

Question : How add() method checks whether the set already contains the specified element or not?
As we know in a HashMap each key is unique and when we call put(Key, Value) method, it returns the previous value associated with key, or null if there was no mapping for key. So in add() method we check the return value of map.put(key, value) method with null value.

If map.put(key, value) returns null, then the statement �map.put(e, PRESENT) == null� will return true and element is added to the HashSet(internally HashMap).
If map.put(key, value) returns old value of the key, then the statement �map.put(e, PRESENT) == null� will return false and element is not added to the HashSet(internally HashMap).
As LinkedHashSet extends HashSet, so it internally calls constructors of HashSet using super(). Similarly creating an object of TreeSet class internally creates object of Navigable Map as backing map.

Related Article : How HashMap internally works in Java.

This article is contributed by Gaurav Miglani. If you like GeeksforGeeks and would like to contribute, you can also write an article using contribute.geeksforgeeks.org or mail your article to contribute@geeksforgeeks.org. See your article appearing on the GeeksforGeeks main page and help other Geeks.

*/