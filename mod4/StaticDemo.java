class Student {
    int rollNo;
    String name;

    // Static variable (shared by all objects)
    static String college = "ABC College";

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Static method
    static void changeCollege(String newCollege) {
        college = newCollege;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class StaticDemo {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Chaya");
        Student s2 = new Student(2, "Riya");

        s1.display();
        s2.display();

        // Changing static variable using static method
        Student.changeCollege("XYZ College");

        System.out.println("After changing college:");

        s1.display();
        s2.display();
    }
}