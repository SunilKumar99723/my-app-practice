package com.mycompany.generics;

class Gen<T>{
	T obj;
	
	Gen(T obj){
		this.obj =obj;
		
	}
	 T getObj() {
		 
		 return obj;
	 }
	
	 void showType() {
		 System.out.println("Types of T is : " +obj.getClass().getName());
	 }
	 
	 void printTypeDataValue() {
		 System.out.println("Types of T is : "+obj.toString());
	 }
}

public class GenricsDemo {
	public static void main(String[] argrs) {

//		new Gen<String>().getObj("Sunil");
		Gen<Integer> Iobj = new Gen<Integer>(1028);
//		Gen<Integer> Iobj = new Gen<Integer>(1028.0); compiler error, here , float or double not allowed
		Iobj.showType();
		Iobj.printTypeDataValue();
		
		Gen<String> Sobj = new Gen<String>("Sunil");
		Sobj.showType();
		Sobj.printTypeDataValue();
		
		// Get the Value in Iobj. Notice that no cast is needed
		int iValue = Iobj.getObj();
		System.out.println(" value --  "+iValue);
		
		// Get the Value in Sobj. Notice that no cast is needed
		String sValue = Sobj.getObj();
		System.out.println("String value --- "+sValue);
		
	}
}
