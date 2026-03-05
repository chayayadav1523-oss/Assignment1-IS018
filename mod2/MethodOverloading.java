/**
 * Program to demonstrate method overloading.
 */
public class MethodOverloading {

    // Method 1: Add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double numbers
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.println("Sum of 2 integers: " + add(5, 10));
        System.out.println("Sum of 3 integers: " + add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + add(5.5, 4.5));
    }
}