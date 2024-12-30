package com.mycompany.InterviewQuestion;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;

/*
 * 1.  Yes, Comparator is a functional interface. The equals is an abstract method overriding one of the public methods of java.lang.Object, this doesn�t count as an abstract method.
 * 2. The Comparator only has one abstract method int compare(T o1, T o2), and it meet the definition of functional interface.
 */

/*
    Unlike Comparable, Comparator is external to the element type we are comparing. It�s a separate class. 
    #We create multiple separate classes (that implement Comparator) to compare by different members.
	 Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects.
	#To compare movies by Rating, we need to do 3 things : 

	1. Create a class that implements Comparator (and thus the compare() method that does the work previously done by compareTo()).
	2. Make an instance of the Comparator class.
	3. Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator. 
*/
//
//Now, suppose we want to sort movies by their rating and names as well. When we make a collection element comparable(by having it implement Comparable), 
//we get only one chance to implement the compareTo() method. The solution is using Comparator.
///A class 'Movies' that implements Comparable
class Movies implements Comparable<Movies>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movies m)
	{
		return this.year - m.getYear();
	}

	// Constructor
	public Movies(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movies>
{
	public int compare(Movies m1, Movies m2)
	{
		if (m1.getRating() < m2.getRating()) return -1;
		if (m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movies>
{
	public int compare(Movies m1, Movies m2)
	{
		return m1.getName().compareTo(m2.getName());
	}
}

//Driver class
class ComparatorExampleMain
{
	public static void main(String[] args)
	{
		ArrayList<Movies> list = new ArrayList<Movies>();
		list.add(new Movies("Force Awakens", 8.3, 2015));
		list.add(new Movies("Star Wars", 8.7, 1977));
		list.add(new Movies("Empire Strikes Back", 8.8, 1980));
		list.add(new Movies("Return of the Jedi", 8.4, 1983));

		// Sort by rating : (1) Create an object of ratingCompare
		//				 (2) Call Collections.sort
		//				 (3) Print Sorted list
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list, ratingCompare);
		for (Movies Movies: list)
			System.out.println(Movies.getRating() + " " +Movies.getName() + " " +Movies.getYear());


		// Call overloaded sort method with RatingCompare
		// (Same three steps as above)
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list, nameCompare);
		for (Movies Movies: list)
			System.out.println(Movies.getName() + " " +	Movies.getRating() + " " +Movies.getYear());

		// Uses Comparable to sort by year
		System.out.println("\nSorted by year");
		Collections.sort(list);
		for (Movies Movies: list)
			System.out.println(Movies.getYear() + " " +	Movies.getRating() + " " +Movies.getName()+" ");
	}
}
