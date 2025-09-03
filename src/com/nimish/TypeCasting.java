package com.nimish;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
        // int num = input.nextInt();
        // System.out.println (num);

        // type casting
        // int number = (int)(21.34f);
        // System.out.println(num);

        // automatic type promotions in expressions
        // int a = 257;
        // byte b = (byte)(a); // 257 % 256
        // System.out.println(b);

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;
        // int d = (a * b) / c;
        // System.out.println(d);


        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 12.04f;
        double d = 234.54566;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double;
        System.out.println((f*b) + " " + (i/c) + " " + (d * s));
        System.out.println(result);



    }
}
