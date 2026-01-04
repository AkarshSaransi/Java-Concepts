package com.coding.abstraction;

// Base class representing a generic vehicle
class Vehicle {
    // Concrete method: all vehicles can start
    void start() {
        System.out.println("Vehicle is starting");
    }

    // Concrete method: all vehicles can stop
    void stop() {
        System.out.println("Vehicle is stopping");
    }
}

// Abstract class: cannot be instantiated directly
// Represents a generic car, but doesn't define how to honk
abstract class Car extends Vehicle {
    // Abstract method: no body, must be implemented by subclasses
    abstract void honk();

    // Concrete method: provides common functionality to all cars
    void displayInfo() {
        System.out.println("This is a car.");
    }
}

// Concrete class: provides implementation for all abstract methods
class Sedan extends Car {
    // Implementation of the abstract method from Car
    @Override
    void honk() {
        System.out.println("Sedan honking: Beep Beep!");
    }
}