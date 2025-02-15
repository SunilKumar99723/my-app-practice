package com.mycompany.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CommonCharsFinder {

    static String findCommonChars(String a, String b) {
        StringBuilder resultBuilder = new StringBuilder();
        Set<Character> charsMap = new HashSet<Character>();
        int count =0;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i); //a and b are the two words given by the user
             if (b.indexOf(ch) != -1){
                 charsMap.add(Character.valueOf(ch));
             }
        }

        Iterator<Character> charsIterator = charsMap.iterator();
        while(charsIterator.hasNext()) {
            resultBuilder.append(charsIterator.next().charValue());
            count++;
        }
        System.out.println(" count -- "+count);
        return resultBuilder.toString();
    }
    // An illustration here
    public static void main(String[] args) {
       String s1 = "cd!";
       String s2 = "fe";

       String commons = findCommonChars(s1, s2);
       System.out.println(commons);     
    }

}