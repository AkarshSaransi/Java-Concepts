# Encapsulation in Java

## Definition
Encapsulation is an Object-Oriented Programming (OOP) concept where the data (fields) and the code (methods) that manipulates the data are bundled together. It restricts direct access to some of an object's components, which is a means of preventing unintended interference and misuse of the data.

## How to Achieve Encapsulation in Java
Encapsulation in Java is achieved by:
1. Declaring the fields of a class as `private`.
2. Providing public `getter` and `setter` methods to access and update the values of the fields.

---

## Why Use Encapsulation?
- To protect the internal state of an object from unintended or harmful changes.
- To control how important variables are accessed and modified.
- To increase code maintainability and flexibility.

---

## Example: Person Class
```java
public class Encapsulation {
    private String name;
    private int age;

    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
```

---

## Usage Example
```java
public class Main {
    public static void main(String[] args) {
        Encapsulation user = new Encapsulation("Alice", 25);
        user.displayInfo();
        user.setName("Bob");
        user.setAge(30);
        user.displayInfo();
        user.setAge(-5); // Invalid, age not updated
        user.displayInfo();
    }
}
```

---

## Key Points
- Fields are made `private` to hide them from outside access.
- Public `getter` and `setter` methods provide controlled access.
- Validation logic can be added in setters to ensure data integrity.

---

## Summary Table
| Encapsulation Feature | Purpose                                  |
|----------------------|-------------------------------------------|
| Private fields       | Hide data from outside                    |
| Getters/Setters      | Controlled access to fields               |
| Validation in setter | Prevent invalid data                      |

---

Encapsulation is fundamental for writing robust, maintainable, and secure Java code. Practice using it in all your classes!
