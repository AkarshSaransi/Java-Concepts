package com.coding.encapsulation;

// Encapsulation: Wrapping data (fields) and code (methods) together as a single unit
// and restricting direct access to some of the object's components.
public class Encapsulation {
    // Private fields: cannot be accessed directly from outside
    private String name;
    private int age;

    // Public constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Public getter for age
    public int getAge() {
        return age;
    }

    // Public setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Method to display info
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
