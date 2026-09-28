package com.nimish.ArrayProblems;
import java.util.Arrays;

public class swapAlternateElem {
    static void swapAlternateElements(int[] arr) {
        for (int i = 0; i < arr.length-1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        swapAlternateElements(Array);
        System.out.println(Arrays.toString(Array));
    }
}

