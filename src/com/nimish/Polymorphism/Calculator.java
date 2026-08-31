package com.nimish.Polymorphism;

public class Calculator {
    int add ( int a, int b) {
        return a + b;
    }

    // Overloading add method
    int add ( int a, int b, int c) {
        return a + b + c;
    }

    double add (int a, int b, int c, double d){
        return a + b + c + d;
    }
}
