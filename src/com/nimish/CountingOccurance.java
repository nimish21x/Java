package com.nimish;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        int n = 34412;
        System.out.println("Enter the number whose occurance you want to count:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;

        while (n > 0){
            int rem = n%10;
            if (rem == x){
                count++;
            }
            n = n/10;
        }

        System.out.println("The number occurs " + count + " times.");

    }
}
