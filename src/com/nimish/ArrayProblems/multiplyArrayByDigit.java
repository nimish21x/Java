package com.nimish.ArrayProblems;

public class multiplyArrayByDigit {

    static int [] multiplyArray (int [] arr, int digit) {
        for (int i = 0; i < arr.length; i++){
            arr[i]  = arr[i] * digit;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        System.out.println(java.util.Arrays.toString(multiplyArray(Array, 10)));
    }
}
