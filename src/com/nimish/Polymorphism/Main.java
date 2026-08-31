package com.nimish.Polymorphism;

public class Main {
    public static void main(String[] args) {

        //Method Overloading
        Calculator C = new Calculator();
//        System.out.println(C.add(2,3));
//        System.out.println(C.add(2,3,4));
//        System.out.println(C.add(1,2,3,4.66));

        // Method Overriding
        Circle c = new Circle();
        // c.draw();
        doDrawingStuff(c);

        Shape s = new Shape();
        doDrawingStuff(s);
    }
        // Dynamic Method Dispatch
        public static void doDrawingStuff ( Shape s) {
            s.draw();
        }
}
