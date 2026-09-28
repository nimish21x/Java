package com.nimish.ArrayProblems;

public class missingNum {
    static int getMissingNum (int[] arr) {
        int n = arr.length + 1;
        int expectedSum = 0;
        expectedSum = n * (n+1) / 2;
        int actualSum = 0;
        for (int i : arr) {
            actualSum += i;
        }
        int num = expectedSum - actualSum;
        return num;
    }

    public static void main(String[] args) {
        int[] Array = {1, 2, 4, 5, 6, 7};
        System.out.println(getMissingNum(Array));
    }
}
