package com.coding.encapsulation;

public class MainEncapsulation {
    public static void main(String[] args) {
        // OOPS Concept Two: Encapsulation
        Encapsulation user = new Encapsulation("Charlie", 22);
        user.displayInfo();

        // Changing values using setters
        user.setName("Diana");
        user.setAge(28);
        user.displayInfo();

        // Attempt to set invalid age
        user.setAge(-10); // Should not update
        user.displayInfo();
    }
}
