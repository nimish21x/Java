package com.nimish.ArrayProblems;

import java.util.HashMap;

public class findMode {
    static int getModeOfArray (int[] Array) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : Array) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        }

        for (int i : freq.keySet()){
            System.out.println(i + " -> " + freq.get(i));
        }

        int maxFreqVal = -1;
        int maxFreqKey = -1;
        for (int key : freq.keySet()) {
            int currentKeyVal = key;
            int currentKeyFreq = freq.get(key);
            if(currentKeyFreq > maxFreqVal) {
                maxFreqVal = currentKeyVal;
                maxFreqKey = currentKeyVal;
            }
        }
        return maxFreqVal;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,2,3,2,3,3,3,3,2,4,4,4,4,4,5,5,5,5,5,5,5};
        System.out.println(getModeOfArray(arr));

    }
}
