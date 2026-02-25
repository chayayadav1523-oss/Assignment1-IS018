/**
 * Program to demonstrate single inheritance.
 */

// Base class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class InheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();   // Inherited method
        dog.bark();  // Own method
    }
}