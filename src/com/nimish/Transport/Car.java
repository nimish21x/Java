package com.nimish.Transport;

public class Car extends Vehicle {
    public String transmissionType;
    public int noOfDoors;

    Car (String name, String model, int noOfTyres, int noOfDoors, String transmissionType){
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    public void startAc() {
        System.out.println("AC started of "+ name);
    }
}
