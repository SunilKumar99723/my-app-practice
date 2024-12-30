package com.mycompany.generics;

//In generic code, the question mark (?), called the wildcard, represents an unknown type.
//The wildcard can be used in a variety of situations: as the type of a parameter, field, or local variable; 
//sometimes as a return type (though it is better programming practice to be more specific).
class WildCardGenerics<T extends Number> {
	T[] nums;

	public WildCardGenerics(T[] nums) {
		super();
		this.nums = nums;
	}
	
	double average() {
		double sum =0.0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i].doubleValue();
			return sum/nums.length;
		}
		return sum;
	}

	boolean sameAvg(WildCardGenerics<?> obj) {
		if(average() == obj.average()) {
			return true;
		}
		return false;

	}
	
}

class WildCardGenericsDemo{
	public static void main(String[] args) {
		Integer intNums[] = {1,2,3,4,5};
		WildCardGenerics<Integer> intObj = new WildCardGenerics<Integer>(intNums);
		double v =intObj.average();
		System.out.println("Integer Obj average value - "+v);
		
		
		Double doubleNums[] = {1.0,2.0,3.0,4.0,5.0};
		WildCardGenerics<Double> doubleObj = new WildCardGenerics<Double>(doubleNums);
		double w =doubleObj.average();
		System.out.println("Double Obj average value - "+w);
		
		
		Float floatNums[] = {1.3F,2.6F,3.4F,4.0F,5.7F};
		WildCardGenerics<Float> floatObj = new WildCardGenerics<Float>(floatNums);
		double x =floatObj.average();
		System.out.println("Float Obj average value  - "+x);
		
//		 Here we are comparing with different objects (Using wild card)
		// now , see which array has same average ,
		System.out.println("Average value of intObj & doubleObj - ");
		if(intObj.sameAvg(doubleObj)) 
		    {System.out.println("are the same"); }
			else 
			{System.out.println("are not same"); }
		
		System.out.println("Average value of intObj & floatObj - ");
		if(intObj.sameAvg(floatObj)) 
	    {System.out.println("are the same"); }
		else 
		{System.out.println("are not same"); }
	}
	
}
