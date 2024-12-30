package com.mycompany.comparableVsComparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingComparableAndComparator {
	public static void main(String[] argrs) {
		
		// Using Comparable
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Sunil", "e5647", 1000 , 807232));
		emps.add(new Employee("Vikash", "e9876", 100 , 9997232));
		emps.add(new Employee("Mukesh", "e5577", 900 , 797232));
		emps.add(new Employee("Anil", "e88587",8000 , 697232));
		emps.add(new Employee("Prem", "e1568", 300 , 8797232));
	
		System.out.println(emps);
		
		Collections.sort(emps);
		
		System.out.println(emps);
		
//		Using Comparator
		ArrayList<Person> person = new ArrayList<>();
		
		person.add(new Person("Sunil", "Jhumri Telaiya", 1000 , 807232));
		person.add(new Person("Vikash", "Mumbai", 100 , 9997232));
		person.add(new Person("Mukesh", "Bangalore", 900 , 797232));
		person.add(new Person("Anil", "Behradih",8000 , 697232));
		person.add(new Person("Prem", "Koderma", 300 , 8797232));
		
		System.out.println("Without sort: \n "+person);
		
		Collections.sort(person,new PersonIDComparator()); // Sorting Pid wise
		
		System.out.println("sorting pid wise : \n "+person);
		
		Collections.sort(person,new PersonNameComparator()); // sorting Name wise
		
		System.out.println("sorting Name wise : \n "+person);

		Collections.sort(person,new PersonAddressComparator()); // sorting address wise
		
		System.out.println("sorting address wise : \n "+person);
	
		Collections.sort(person,new PersonPhoneNumberComparator()); // sorting Phone number wise
		
		System.out.println("sorting Phone number wise : \n "+person);
	}
	
		
	

}
