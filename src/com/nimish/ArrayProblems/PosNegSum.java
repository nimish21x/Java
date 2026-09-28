package com.nimish.ArrayProblems;

public class PosNegSum {
    static void givePositiveSum(int[] arr) {
        int posSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posSum += arr[i];
            }
        }
        System.out.println("Sum of positive numbers is " + posSum);
    }

    static void giveNegativeSum(int[] arr2) {
        int negSum = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 0) {
                negSum += arr2[i];
            }
        }
        System.out.println("Sum of negative numbers is " + negSum);
    }

    public static void main(String[] args) {
        int[] Array = {-1, -4, -5, -7, 3, 6, 9, 0};
        givePositiveSum(Array);
        giveNegativeSum(Array);
    }

}
