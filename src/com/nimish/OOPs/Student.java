package com.nimish.OOPs;

public class Student {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int a) {
        this.age = a;
    }

    // Default Constructor
    public Student(){
        System.out.println("Student Default Constructor Called");
    }

    // Parameterised Constructor
    public Student (int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterised Constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.gf = gf;
    }

    // Copy Constructor
    public Student (Student srcobj){
        System.out.println("Student Copy Constructor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }
    // Methods/Behaviours
    public void study(){
        System.out.println(name + " studying");
    }
    public void sleep(){
        System.out.println(name + " sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }

    private void gfChatting(){
        System.out.println(name + "gfChatting");
    }
}

