package com.mycompany.collection.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] argrs) {
		
		PriorityQueue<String> pQ = new PriorityQueue<String>();
		pQ.add("ASHISH");
		pQ.add("AAKASH");
		pQ.add("RUPA");
		pQ.add("SURESH YADAV");
		pQ.add("HERA LAL");
		
		
	Iterator<String> it =	pQ.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	}

	}
}
