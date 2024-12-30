package com.mycompany.generics;

class Gen2<T,V>{
	T obj1;
	V obj2;
	
	Gen2(T obj1, V obj2){
		this.obj1 =obj1;
		this.obj2 =obj2;
		
	}
	 T getObj1() {
		 
		 return obj1;
	 }
    V getObj2() {
		 
		 return obj2;
	 }
	
	 void showTypes() {
		 System.out.println("Types of T is : " +obj1.getClass().getName());
		 System.out.println("Types of V is : " +obj2.getClass().getName());
	 }
	 
	 void printTypeDataValue() {
		 System.out.println("Types of T is : "+obj1.toString());
		 System.out.println("Types of V is : "+obj2.toString());
	 }
}
public class GenericsWithTwoTypeParameters {
	public static void main(String[] argrs) {
		Gen2<String, Integer> twoGenObj = new Gen2<String, Integer> ("4PS11CS119",88);
		twoGenObj.showTypes();
		
		String vStr = twoGenObj.getObj1();
		int vNum= twoGenObj.getObj2();
		
		System.out.println( " String Value  " +vStr+ "\n Number Value - "+vNum );
	}
}
