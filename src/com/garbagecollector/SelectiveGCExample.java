package com.garbagecollector;

public class SelectiveGCExample {

    // Class to represent an object that can be cleaned up by GC
    static class Demo {
        private String name;

        public Demo(String name) {
            this.name = name;
        }

        // Finalize method to print when the object is garbage collected
        @Override
        protected void finalize() throws Throwable {
            System.out.println(name + " object is deleted by GC.");
        }
    }

    public static void main(String[] args) {
        // Creating 3 objects
        Demo demo1 = new Demo("Object 1");
        Demo demo2 = new Demo("Object 2");
        Demo demo3 = new Demo("Object 3");

        // Making demo1 and demo3 unreachable (nullifying them)
        demo1 = null; 
        demo3 = null; 

        // Request Garbage Collection
        System.out.println("Requesting Garbage Collection...");
        System.gc();

        // Sleep for a few seconds to let GC clean up the objects
        try { Thread.sleep(3000); } catch (InterruptedException e) {}

        // demo2 should remain alive because it's still referenced
        System.out.println("End of program.");
    }
}
