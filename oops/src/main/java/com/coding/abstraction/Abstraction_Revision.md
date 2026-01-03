# Abstraction in Java

## Definition
Abstraction is an Object-Oriented Programming (OOP) concept where only the essential features of an object are shown, while unnecessary details are hidden. It helps reduce complexity and allows the programmer to focus on what an object does instead of how it does it.

## How to Achieve Abstraction in Java
Abstraction in Java can be achieved in two ways:
1. **Abstract Classes**
2. **Interfaces**

---

## 1. Abstract Classes
- An abstract class is a class that cannot be instantiated directly.
- It can have both abstract methods (without a body) and concrete methods (with a body).
- Abstract methods must be implemented by subclasses.
- Abstract classes can have fields and constructors.

### Analogy: "Vehicle"
Imagine you’re designing a blueprint for all vehicles.
- All vehicles have some things in common: they have wheels, can start, and can stop.
- But each type of vehicle (Car, Bike, Truck) may have a different way to honk.

So, you create an abstract class called `Vehicle`:
- It has concrete methods: `start()`, `stop()` (all vehicles do these the same way).
- It has an abstract method: `honk()` (each vehicle honks differently).

**Use abstract class when:**
- You want to provide some shared code and force subclasses to implement specific details.

#### Example:
```java
abstract class Vehicle {
    void start() { System.out.println("Vehicle started"); }
    void stop() { System.out.println("Vehicle stopped"); }
    abstract void honk(); // Each vehicle must define this
}
class Car extends Vehicle {
    void honk() { System.out.println("Car honks: Beep!"); }
}
```

---

## 2. Interfaces
- An interface is a contract that defines what a class can do, without specifying how.
- All methods in an interface are abstract by default (until Java 8, which allows default and static methods with code).
- Interfaces cannot have constructors or instance fields (only public static final fields).
- A class can implement multiple interfaces (multiple inheritance of type).

### Analogy: "Flyable" or "Swimmable"
Think about abilities or roles.
- Not all vehicles can fly or swim, but some can.
- A plane, a bird, and a superhero can all fly, but they are not related by inheritance.
- You want to say: “Anything that can fly must have a `fly()` method.”

So, you create an interface called `Flyable`:
- It just says: “If you can fly, you must implement `fly()`.”

**Use interface when:**
- You want to define a capability that can be added to any class, even if they are unrelated.

#### Example:
```java
interface Flyable {
    void fly();
}
class Bird implements Flyable {
    public void fly() { System.out.println("Bird flies!"); }
}
class Airplane implements Flyable {
    public void fly() { System.out.println("Airplane flies!"); }
}
```

---

## Summary Table
| Analogy   | Use Abstract Class For...      | Use Interface For...                |
|-----------|-------------------------------|-------------------------------------|
| Blueprint | Common base with shared code  | Ability/role for unrelated things   |
| Example   | All vehicles (Car, Bike, Truck) | Anything that can fly/swim/drive    |
| Java Example | Vehicle with honk() method | Flyable with fly() method           |

---

## In short:
- Use abstract classes for a family of related things with shared code and some differences.
- Use interfaces for abilities or roles that can be added to any class, even if they’re not related.

---

Feel free to add your own notes or code examples below as you learn more!