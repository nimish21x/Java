package com.nimish;

import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        // String inputs
        System.out.print("Enter your name:");
        Scanner input = new Scanner(System.in);
        // String name = input.next();  This takes only a single word till space.
        String name = input.nextLine();
        System.out.println(name);
    }
}
