package com.nimish;

public class Scoping {
    public static void main (String[] args){
        // Scoping in Java defines where a variable is accessible in a program.
        // A variable is only accessible inside the area it is created.

        int a = 10;
        {
            System.out.println(a);
            int b = 20;
        }
        // System.out.println(b); Doesn't prints because b was initialised in different block.

        // loop scope
        for (int i = 0; i<3; i++){
            System.out.println(i);
        }
        // System.out.println(i); Invalid because 'i' was declared in for block.
    }
}
