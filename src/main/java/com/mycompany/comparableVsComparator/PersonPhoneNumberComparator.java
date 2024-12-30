package com.mycompany.comparableVsComparator;

import java.util.Comparator;

public class PersonPhoneNumberComparator implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getPhoneNumber()-o2.getPhoneNumber();
	}
}
