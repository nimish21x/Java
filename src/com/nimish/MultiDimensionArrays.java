package com.nimish;
import java.util.Scanner;
import java.util.Arrays;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        // It is not necessary to give number of columns for 2 D Array.
//        int [][] arr = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };
//        // Output Print
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }


        int[][] arr = new int[3][3];
        // Input
        for (int i = 0; i <  arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        //Output
//        System.out.println("The entered 2D Array is:");
//        for (int i = 0; i < arr.length; i++){
//            for (int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + "  ");
//            }
//            System.out.println();
//        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
