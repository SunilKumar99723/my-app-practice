package com.mycompany.generics;

class GenricsForAverage<T extends Number>{
	T[] numbers;
	GenricsForAverage(T[] obj){
		numbers =obj;
	}
	
	double average() {
		double sum= 0.0;
		
		for(int i=0;i<numbers.length;i++) {
			
			sum += numbers[i].doubleValue();
				}
			
		return sum/numbers.length;
		}
	
}


public class GenericAverage {
	public static void main(String[] argrs) {
		
		Integer iNumbers[] = {1,2,3,4,5};
		GenricsForAverage<Integer> intObj = new GenricsForAverage<Integer>(iNumbers);
		double v = intObj.average();
		
		System.out.println("intObj average is : "+v);
		
		
		Double dNumbers[] = {1.2,2.3,3.4,4.5};
		GenricsForAverage<Double> doubleObject = new GenricsForAverage<Double>(dNumbers);
		Double w = doubleObject.average();
		
		System.out.println("intObj average is : "+w);
		
		
		// This is not possible , String is not the sub class of Number
//		String strs[] = {"2","5","6","7"};
//		GenricsForAverage<String> strObject = new GenricsForAverage<String>(Strs);
//		Double x = strObject.average();
//		
//		System.out.println("intObj average is : "+w);
//		

	}
}
