package com.nimish.ArrayProblems;

public class SearchingElem {
    static void searchElement (int[] arr, int elem){
        int flag = 0;
        int idx = 0;
        for (int i=0;  i < arr.length; i++) {
            if (arr[i] == elem){
                flag++; idx = i;
                break;
             }
        }

        if (flag != 0) {
            System.out.println("Element found at index : " + idx );
        }
        else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        int[] Array = {1, 2, 3, 4, 5};
        searchElement(Array, 3);
        searchElement(Array, 6);
    }
}
