package com.ericsson.ma.java.misc.classloading;

public class CLTester {
    public static void main(String args[]) throws Exception {

        // Create a FileClassLoader
        // Use args[0] as directory
        MyClassLoader loader = new MyClassLoader(args[0]);

        // Load class from class loader
        // Use args[1] as class name
        Class c = loader.loadClass(args[1]);

        // Create an instance of the class just loaded
        Object tester = c.newInstance();
    }
}
