package com.nimish;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Print the largest of the three numbers.
//        int max = a;
//        if (max<b){
//            max = b;
//        }
//        if (max<c){
//            max = c;
//        }
//        System.out.println("The largest number among the three entered numbers is " + max);


        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
    }
}
