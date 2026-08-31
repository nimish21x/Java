package com.nimish;
import java.util.Scanner;

public class top4percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] marks = new int[5];
        int sum = 0;

        System.out.println("Enter marks of 5 subjects:");
        for (int i = 0; i<5; i++){
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        int min = marks[0];
        for (int i = 0; i<5; i++){
            if (marks[i] < min){
                min = marks[i];
            }
        }

        int top4sum = sum - min;

        double percentage = (top4sum/400.0) * 100;

        System.out.println("Percentage of top 4 subjects is: " + percentage + "%");
    }
}



