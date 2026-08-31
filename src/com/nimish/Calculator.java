package com.nimish;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;

        while (true) {
            System.out.println("Enter the operator (+, -, *, /, %, x to exit):");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                System.out.println("Calculator exited.");
                break;
            }

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter number 1:");
                int num1 = sc.nextInt();
                System.out.println("Enter number 2:");
                int num2 = sc.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                } else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Modulo by zero is not allowed.");
                        continue;
                    }
                }


                System.out.println("Result: " + ans);

            } else {
                System.out.println("Invalid Operation");
            }
        }

        sc.close();
    }
}
