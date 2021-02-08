package com.fifthHomeWork;

import java.time.chrono.MinguoDate;

public class Person {

    public String name;
    public int age;
    public int weight;
    public double height;


    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight () {
        return height;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public void setHeight(double newHeight) {
        this.height = newHeight;
    }

}
