// Checked Exception Example
import java.io.*;

class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("test.txt"); // Checked exception
        } catch (FileNotFoundException e) {
            System.out.println("Checked Exception caught: File not found.");
        }

        // Unchecked Exception Example
        try {
            int a = 10 / 0;  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: Division by zero.");
        }
    }
}