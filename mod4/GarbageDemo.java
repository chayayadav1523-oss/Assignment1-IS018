class GarbageDemo {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collector called for object.");
    }

    public static void main(String[] args) {

        GarbageDemo obj1 = new GarbageDemo();
        GarbageDemo obj2 = new GarbageDemo();

        // Making objects eligible for garbage collection
        obj1 = null;
        obj2 = null;

        // Requesting JVM to run Garbage Collector
        System.gc();

        System.out.println("End of main method.");
    }
}