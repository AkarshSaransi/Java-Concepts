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


//Below i am using an anonymous inner class to provide an implementation for the abstract method honk() of the abstract class Car.

// When i write:

// Car myCar = new Car() {
// void honk() {
// System.out.println("Anonymous Car honking: Honk Honk!");
// }
// };

// i am not directly creating an instance of the abstract class Car. Instead, you are creating an unnamed subclass of Car right there, and providing the required implementation for the abstract method honk(). The Java compiler generates a new class behind the scenes, and you get an object of that anonymous subclass.


        Car myCar = new Car()
         {
            void honk() {
                System.out.println("Anonymous Car honking: Honk Honk!");
            }
        };
        myCar.honk();
    }
}