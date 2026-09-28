package com.nimish.ArrayProblems;

import java.util.HashSet;

public class arrayUnion {
    static HashSet<Integer> getUnion(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : arr1) {
            set.add(i);
        }

        for (int i : arr2) {
            set.add(i);
        }

        return set;
    }

    public static void main(String[] args) {
        int[] Array1 = {1,2,3,4,5};
        int[] Array2 = {3,4,5,5,6};
        HashSet<Integer> n = getUnion(Array1, Array2);
        System.out.println(n);
    }
}
