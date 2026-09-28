package com.nimish.ArrayProblems;

public class sort0sAnd1s {
    static int[] sortZeroesAndOnes (int[] array) {
        int n = array.length;
        int i = 0;
        int j = n - 1;

        while (i < j) {
            if (array[i] == 1 && array[j] == 0) {
                array [i] = 0;
                array [j] = 1;
            }
            if (array[i] == 0) {
                i++;
            }
            if (array[j] == 1) {
                j--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] Arr = {0, 1, 0, 1, 0, 0, 1, 1, 0};
        int[] ArrSol = sortZeroesAndOnes(Arr);
        for (int k : ArrSol) {
            System.out.print(k + " ");
        }
    }

}
