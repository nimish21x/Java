package com.nimish;

import java.util.Scanner;


public class Main {
    public static void main (String [] args){
        System.out.print("Hello, World! ");
        System.out.println("My name is Nimish"); // println adds new line.

        // Inputs
        System.out.println("What is your age?");
        Scanner input = new Scanner (System.in);
        System.out.println("The entered age is " + input.nextInt());
    }


}