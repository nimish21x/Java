package com.nimish.ArrayProblems;

public class firstUnsortedElement {
    static int returnFirstUnsortedElement(int[] Arr) {

        int i = 0;

        // Skip equal elements
        while (i < Arr.length - 1 && Arr[i] == Arr[i + 1]) {
            i++;
        }

        // All elements are equal
        if (i == Arr.length - 1)
            return -1;

        boolean ascending = Arr[i + 1] > Arr[i];

        for (; i < Arr.length - 1; i++) {

            if (ascending && Arr[i + 1] < Arr[i])
                return Arr[i + 1];

            if (!ascending && Arr[i + 1] > Arr[i])
                return Arr[i + 1];
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] Array = {5,4,3,1,2};
        System.out.println(returnFirstUnsortedElement(Array));
    }
}
