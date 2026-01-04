package com.coding.encapsulation;

// Example class demonstrating encapsulation with validation
public class EncapsulationExamples {
    public static void main(String[] args) {
        // Create an object with initial values
        Encapsulation person = new Encapsulation("Alice", 25);
        person.displayInfo(); // Name: Alice, Age: 25

        // Modify fields using setters
        person.setName("Bob");
        person.setAge(30);
        person.displayInfo(); // Name: Bob, Age: 30

        // Try to set invalid age
        person.setAge(-5); // Should not update age
        person.displayInfo(); // Name: Bob, Age: 30
    }
}
