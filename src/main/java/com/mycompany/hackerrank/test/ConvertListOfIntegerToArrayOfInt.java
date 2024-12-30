package com.mycompany.hackerrank.test;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfIntegerToArrayOfInt {

	  // Program to convert list of integer to array of int in Java
    public static void main(String args[])
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
 
        int[] primitive = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
 
        System.out.println(Arrays.toString(primitive));
    }

}
