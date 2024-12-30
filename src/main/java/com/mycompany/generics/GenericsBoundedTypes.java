package com.mycompany.generics;

class BoundedTypesGen<T extends Number>{ // In "BoundedTypesGen" Generics , the type argument for 'T' must be either number, or class derived from number
	
	T[] nums;
	public BoundedTypesGen(T[] obj) {
		nums = obj;
	}
	
	double average() {
		double sum =0.0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i].longValue();// The java compile knows that all objects of type T can call  doubleValue() or longValue() or floatValue() because it is a method declared by Number.
//			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
		
	}
}

public class GenericsBoundedTypes {
	public static void main(String[] argrs) {

		Integer intNums[] = {1,2,3,5};
		BoundedTypesGen<Integer> intTypeGen = new BoundedTypesGen<Integer>(intNums);
		double v = intTypeGen.average();
		System.out.println("bTypeGen  Average value - " +v);
		
		
		Double doubNums[] = {1.1, 2.3, 4.3};
		BoundedTypesGen<Double> doubTypeGen = new	BoundedTypesGen<Double>(doubNums);
		Double d = doubTypeGen.average();
	}
}
