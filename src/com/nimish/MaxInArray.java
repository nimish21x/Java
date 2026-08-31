package com.nimish;
import java.util.Scanner;
import java.util.Arrays;

public class MaxInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] Arr = new int[n];

        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + "   ");
        }

        int MaxEl = Arr[0];

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] > MaxEl){
                MaxEl = Arr[i];
            }
        }

        System.out.println("\nThe biggest element in the entered Array is " + MaxEl);
        sc.close();
    }
}
