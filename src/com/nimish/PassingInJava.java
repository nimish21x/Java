package com.nimish;

import java.util.Arrays;

public class PassingInJava {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 12};
        System.out.println(Arrays.toString(nums));
        change (nums);
        System.out.println(Arrays.toString(nums)); //Arrays are mutable in Java.
    }
    static void change (int[] Arr){
        Arr[0] = 99;
    }
}
