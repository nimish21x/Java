package com.nimish.ArrayProblems;

public class maxOfArray {
    static void findMaxElem (int[] arr){
        int elem = arr[0];
        for (int i = 0; i <arr.length; i++){
            if (elem < arr [i]) {
                elem = arr[i];
            }
        }
        System.out.println("Maximum Element is " + elem);
    }

    public static void main(String[] args) {
        int[] Array = {-12, -432, -54, 756, -865};

        findMaxElem(Array);
    }
}
