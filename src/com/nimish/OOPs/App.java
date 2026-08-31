package com.nimish.OOPs;

public class App {
    public static void main(String[] args) {

        // Default Constructor
//        Student A = new Student();
//        A.id = 1;
//        A.age = 16;
//        A.name = "Rohan";
//        A.nos = 9;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.study();
//        A.sleep();
//        A.bunk();

        // Parameterised Constructor
//        Student A = new Student(1, 17, "Rahul", 8, "Tina");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.study();

        // Copy Constructor
//        Student B = new Student (A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.bunk();
//        B.sleep();
//        B.study();

        // Encapsulation
        Student A = new Student(1, 17, "Rahul", 8, "Tina");

        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setAge(57);

        System.out.println(A.getAge());

        A.bunk();
        A.sleep();
        A.study();
    }
}
