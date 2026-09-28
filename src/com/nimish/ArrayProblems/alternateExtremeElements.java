package com.nimish.ArrayProblems;

public class alternateExtremeElements {
    static void getAlternateExtremeElements (int[] Array) {
        int n = Array.length;
        int i = 0;
        int j = n-1;

        while (i <= j) {
            if (i == j) {
                System.out.println(Array[i]);
                return;
            }
            System.out.print(Array[i] + " ");
            i++;
            System.out.print(Array[j] + " ");
            j--;
        }

    }

    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5};
        getAlternateExtremeElements(Arr);
    }
}
