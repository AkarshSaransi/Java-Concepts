package com.coding.abstraction;

public class Main {
    public static void main(String[] args) {
        // OOPS Concept One: Abstraction

        // You cannot do: Car myCar = new Car(); // Error: Car is abstract

        // You can create a Sedan, which is a concrete class
        Sedan mySedan = new Sedan();

        // Methods inherited from Vehicle
        mySedan.start();
        mySedan.stop();

        // Method implemented in Sedan (from abstract Car)
        mySedan.honk();

        // Method from Car (concrete, not abstract)
        mySedan.displayInfo();

        Car myCar = new Car()
         {
            void honk() {
                System.out.println("Anonymous Car honking: Honk Honk!");
            }
        };
        myCar.honk();
    }
}