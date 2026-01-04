package com.coding.abstraction;

// 1. Abstract class: can have methods with code, abstract methods, fields, and constructor
abstract class Animal {
    // Field (can be any access modifier)
    protected String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Concrete method (has code)
    void eat() {
        System.out.println(name + " is eating.");
    }

    // Abstract method (no code)
    abstract void makeSound();
}

// Concrete subclass of Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Implementation of abstract method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

// 2. Interface: can have abstract methods, default/static methods (with code), and fields (public static final only)
interface Swimmable {
    // Field: public static final by default
    int MAX_DEPTH = 100; // meters

    // Abstract method (no code)
    void swim();

    // Default method (has code, since Java 8)
    default void floatOnWater() {
        System.out.println("Floating on water.");
    }

    // Static method (has code, since Java 8)
    static void showMaxDepth() {
        System.out.println("Max depth: " + MAX_DEPTH + " meters");
    }
}

// 3. Multiple inheritance with interfaces
interface Runnable {
    void run();
}

// Class can implement multiple interfaces
class AmphibiousAnimal extends Animal implements Swimmable, Runnable {
    public AmphibiousAnimal(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " makes a unique sound!");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }

    @Override
    public void run() {
        System.out.println(name + " is running.");
    }
}

// Example usage (can be called from Main or a test)
class AbstractionExamplesDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.eat(); // method with code
        dog.makeSound(); // abstract method implemented

        AmphibiousAnimal frog = new AmphibiousAnimal("Froggy");
        frog.eat();
        frog.makeSound();
        frog.swim();
        frog.run();
        frog.floatOnWater(); // default method from interface
        Swimmable.showMaxDepth(); // static method from interface
        // Accessing interface field
        System.out.println("Max depth constant: " + Swimmable.MAX_DEPTH);
    }
}