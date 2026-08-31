package com.nimish.AbstractDesign;

// Interface
interface Bird {
    public void fly();
    public void eat();
}

// Implementation
class Sparrow implements Bird {

    @Override
    public void eat() {
        System.out.println("Sparrow eating..");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow flying..");
    }
}

// Another Implementation
class Crow implements Bird {

    @Override
    public void eat() {
        System.out.println("Crow eating..");
    }

    @Override
    public void fly() {
        System.out.println("Crow flying..");
    }
}

// Main class
public class Main {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {

        Sparrow s = new Sparrow();
        Crow c = new Crow();

        doBirdStuff(s);
        doBirdStuff(c);
    }
}