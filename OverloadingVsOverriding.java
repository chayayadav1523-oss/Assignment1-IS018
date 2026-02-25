/**
 * Program to demonstrate method overloading and method overriding.
 */

// Parent class
class Calculator {

    // Method Overloading (same method name, different parameters)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    void show() {
        System.out.println("Calculator show method.");
    }
}

// Child class
class AdvancedCalculator extends Calculator {

    // Method Overriding (same method, same parameters)
    @Override
    void show() {
        System.out.println("AdvancedCalculator show method.");
    }
}

public class OverloadingVsOverriding {

    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();

        // Overloading
        System.out.println("Sum (int): " + calc.add(10, 20));
        System.out.println("Sum (double): " + calc.add(5.5, 4.5));

        // Overriding
        calc.show();
    }
}