package com.nimish;

public class SwapFunction {
    public static void main(String[] args) {
        Swap(10, 20);
    }

    static void Swap (int a, int b){
        System.out.println("The entered numbers are " + a + " and " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are " + a + " and " + b);
    }
}
