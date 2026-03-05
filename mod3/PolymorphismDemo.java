/**
 * Program to demonstrate polymorphism using method overriding.
 */

// Base class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Derived class 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle.");
    }
}

// Derived class 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.draw();  // Calls Circle's draw()
        s2.draw();  // Calls Rectangle's draw()
    }
}