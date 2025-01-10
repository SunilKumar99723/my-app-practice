package com.mycompany.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindAllMaxRepeatedNumbers {
    public static void main(String[] args) {
        int numArray[] = {12, 12, 63, 63, 3, 3, 4, 4, 4, 5, 5, 13, 13, 13};
        System.out.println(findMaxRepeatedNumbers(numArray));
    }

    public static ArrayList<Integer> findMaxRepeatedNumbers(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        ArrayList<Integer> maxNumbers = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxNumbers.clear();
                maxNumbers.add(entry.getKey());
            } else if (entry.getValue() == maxCount) {
                maxNumbers.add(entry.getKey());
            }
        }

        return maxNumbers;
    }
}
