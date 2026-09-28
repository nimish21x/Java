package com.nimish.ArrayProblems;

public class countZeroesAndOne {
    static void count0and1 (int [] arr) {
        int Zeroes = 0;
        int Ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                Ones++;
            }
            else if (arr[i] == 0) {
                Zeroes++;
            }
        }
        System.out.println("Number of Zeroes is " + Zeroes);
        System.out.println("Number of Ones is " + Ones);
    }

    public static void main(String[] args) {
        int [] Array = {0, 0, 0, 1, 1, 1, 0, 34};
        count0and1(Array);
    }
}
