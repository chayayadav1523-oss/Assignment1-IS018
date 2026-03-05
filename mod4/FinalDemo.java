// Final class (cannot be extended)
final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

class Parent {
    // Final method (cannot be overridden)
    final void show() {
        System.out.println("Final method in Parent class.");
    }
}

class Child extends Parent {
    // Cannot override show() here
}

public class FinalDemo {
    public static void main(String[] args) {

        // Final variable
        final int x = 100;
        // x = 200;  ❌ Error (cannot change value)

        System.out.println("Final variable x = " + x);

        Parent obj = new Child();
        obj.show();

        FinalClass fc = new FinalClass();
        fc.display();
    }
}