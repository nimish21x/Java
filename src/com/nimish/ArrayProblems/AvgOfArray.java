package com.nimish.ArrayProblems;

// Find average of the array

public class AvgOfArray {

    public static double getAverage (int [] arr){
        double sum = 0;
        for (int i:arr){
            sum += i;
        }
        int size = arr.length;
        double avg = sum / size;
        return avg;
    }

    public static void main(String[] args) {
        int[] array = {1 , 2 , 27, 6};
        System.out.println(getAverage(array));
     }
}
