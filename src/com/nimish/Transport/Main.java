package com.nimish.Transport;

public class Main {
    public static void main(String[] args) {
        Car c = new Car ("Maruti", "Swift", 4, 5, "Automatic");
        c.startEngine();
        c.startAc();
        c.stopEngine();

        Motorcycle m = new Motorcycle("Kawasaki", "Ninja", 2, "U", "Stiff");
        m.stopEngine();
        m.Wheelie();
        m.stopEngine();
    }
}
