package com.ericsson.ma.java.misc.classloading;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {

    private String root;

    public MyClassLoader(String rootDir) {
        if (rootDir == null)
            throw new IllegalArgumentException("Null root directory");
        root = rootDir;
    }

    protected Class loadClass(String name, boolean resolve)
            throws ClassNotFoundException {

        // Since all support classes of loaded class use same class loader
        // must check subclass cache of classes for things like Object

        // Class loaded yet?
        Class c = findLoadedClass(name);
        if (c == null) {
            try {
                c = getParent().loadClass(name);
            } catch (Exception e) {
                // Ignore these
            }
        }

        if (c == null) {
            // Convert class name argument to filename
            // Convert package names into subdirectories
            String filename = name.replace('.', File.separatorChar) + ".class";

            try {

                // Load class data from file and save in byte array
                byte data[] = loadClassData(filename);

                // Convert byte array to Class
                c = defineClass(name, data, 0, data.length);

                // If failed, throw exception
                if (c == null)
                    throw new ClassNotFoundException(name);


            } catch (IOException e) {
                throw new ClassNotFoundException("Error reading file: " + filename);
            }
        }

        // Resolve class definition if approrpriate
        if (resolve)
            resolveClass(c);

        // Return class just created

        return c;
    }

    private byte[] loadClassData(String filename)
            throws IOException {

        // Create a file object relative to directory provided
        File f = new File(root, filename);

        // Get size of class file
        int size = (int) f.length();

        // Reserve space to read
        byte buff[] = new byte[size];

        // Get stream to read from
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);

        // Read in data
        dis.readFully(buff);

        // close stream
        dis.close();

        // return data
        return buff;
    }
}
