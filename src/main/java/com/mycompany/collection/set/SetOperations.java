package com.mycompany.collection.set;

//Java Program Demonstrating Operations on the Set
//such as Union, Intersection and Difference operations

//Importing all utility classes
import java.util.*;

//Main class
public class SetOperations {

 // Main driver method
 public static void main(String args[])
 {
     // Creating an object of Set class
     // Declaring object of Integer type
     Set<Integer> a = new HashSet<Integer>();
    
     // Adding all elements to List
     a.addAll(Arrays.asList(
         new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
    
   // Again declaring object of Set class
   // with reference to HashSet
     Set<Integer> b = new HashSet<Integer>();
      
   b.addAll(Arrays.asList(
         new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

      
     // To find union
     Set<Integer> union = new HashSet<Integer>(a);
     union.addAll(b);
     System.out.print("Union of the two Set");
     System.out.println(union);

     // To find intersection
     Set<Integer> intersection = new HashSet<Integer>(a);
     intersection.retainAll(b);
     System.out.print("Intersection of the two Set");
     System.out.println(intersection);

     // To find the symmetric difference
     Set<Integer> difference = new HashSet<Integer>(a);
     difference.removeAll(b);
     System.out.print("Difference of the two Set");
     System.out.println(difference);
 }
}