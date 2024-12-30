package com.mycompany.collection.hashmapvshashtable;

//Java Program to llustarte ConcurrentModificationException
//Using Normal Collections

//Importing required classes
import java.util.*;
import java.util.concurrent.*;


//whenever we call t.start() method the child thread gets activated and invokes run() method. Now main thread starts executing,
//whenever the child thread updates the same map object, it will throw an exception named ConcurrentModificationException.   

/*
Reason: - For example: If we are trying to modify any collection in the code using a thread, 
					  but some another thread is already using that collection, then this will not be allowed.
*/
//HashMapNotThreadSafe  class extending Thread class
class HashMapNotThreadSafe extends Thread {

	// Creating a static HashMap class object
	static HashMap m = new HashMap();

	// run() method for the thread
	public void run()
	{

		// Try block to check for exceptions
		try {

			// Making thread to sleep for 3 seconds
			Thread.sleep(2000);
		}

		// Catch block to handle exceptions
		catch (InterruptedException e) {
		}

		// Display message
		System.out.println("Child Thread updating Map");

		// Putting element in map
		m.put(103, "C");
	}

	// Method 2
	// Main driver method
	public static void main(String arg[]) throws InterruptedException
	{

		// Adding elements to map object created above
		// using put() method
		m.put(101, "A");
		m.put(102, "B");

		// Creating thread inside main() method
		HashMapNotThreadSafe t = new HashMapNotThreadSafe();

		// Starting the thread
		t.start();

		// Operating keySet() method and
		// storing it in Set class object
		Set s1 = m.keySet();

		// Iterating over Set class object
		// using iterators
		Iterator itr = s1.iterator();

		// Holds true till there is single element present
		// inside object
		while (itr.hasNext()) {

			// traversing over elements in object
			// using next() method
			Integer I1 = (Integer)itr.next();

			// Print statement
			System.out.println(
				"Main Thread Iterating Map and Current Entry is:"+ I1 + "..." + m.get(I1));

			// Making thread to sleep for 3 seconds
			Thread.sleep(3000);
		}

		// Printing all elements on console
		System.out.println(m);
	}
}



//O/P :  

/*
 * Main Thread Iterating Map and Current Entry is:101...A Child Thread updating
 * Map Exception in thread "main" java.util.ConcurrentModificationException at
 * java.util.HashMap$HashIterator.nextNode(HashMap.java:1473) at
 * java.util.HashMap$KeyIterator.next(HashMap.java:1497) at
 * practice.collection.hashmapvshashtable.HashMapNotThreadSafe.main(
 * HashMapNotThreadSafe.java:74)
 */