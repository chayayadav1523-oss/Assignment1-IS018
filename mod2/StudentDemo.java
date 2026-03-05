/**
 * Program to demonstrate default and parameterized constructors.
 */
class Student {

    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        // Using default constructor
        Student s1 = new Student();
        s1.display();

        // Using parameterized constructor
        Student s2 = new Student("Chaya", 20);
        s2.display();
    }
}