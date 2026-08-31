package com.nimish;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] Arr = new int[5];
        for (int i = 0; i < Arr.length; i++){
            Arr[i] = sc.nextInt();
        }

        System.out.println("The entered Array is: ");
        for (int j : Arr) {
            System.out.print(j + " ");
        }
    }
}
