package com.mycompany.generics;

class IntegerAdder implements Adder<Integer> {
	  @Override public Integer add(Integer a, Integer b) {
	    return a + b;
	  }
	}