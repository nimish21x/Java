package com.nimish.ArrayProblems;

public class shiftArray {
    static void shiftArrayByOnePosition (int[] Arr) {

        int n = Arr.length;
        int temp = Arr[n-1];

        for (int i = n-1; i > 0; i--) {
            Arr[i] = Arr[i-1];
        }

        Arr[0] = temp;

        for (int i : Arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] Array = {10, 20, 30, 40, 50};
        shiftArrayByOnePosition(Array);
    }
}
