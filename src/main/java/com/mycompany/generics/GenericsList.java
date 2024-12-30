package com.mycompany.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsList<T>  {
	
    List<T> list = new ArrayList<T>();
    
    public GenericsList(){

    }
    public void populate(T t){
        list.add(t);
        System.out.println(list);
    }

 
	public static void main(String[] argrs) {
		  new GenericsList<String>().populate("abc");
		  new GenericsList<Integer>().populate(10);
		  new GenericsList<Character>().populate('B');
		  new GenericsList<Double>().populate(10.22);
		  
		  
		
	}
}
