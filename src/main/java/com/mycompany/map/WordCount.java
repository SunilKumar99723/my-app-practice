package com.mycompany.map;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	Map<String, Integer> frq= new HashMap<>();
	Scanner doc = new Scanner(System.in).useDelimiter("[^a-zA-Z]+");
	
	while(doc.hasNext()) {
		String word =doc.next().toLowerCase();
		System.out.println("word  - "+word);
		Integer count = frq.get(word);
		System.out.println("count  - "+count);
		if(count==null) {
			count=0;
			frq.put(word,1+ count);
		}
	}
		int maxCount = 0;
		String maxWord ="no word";
		for(Entry<String,Integer> ent : frq.entrySet())
			if(ent.getValue()>maxCount)
		{ maxWord = ent.getKey();
		  maxCount = ent.getValue();
			
		}
			
		System.out.println("The most frequent word is - "+maxWord);
		System.out.println(" with "+maxCount + "  occurences.");
	 }
   
}


