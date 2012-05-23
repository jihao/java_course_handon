package com.ericsson.ma.java.misc.classloading;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;

import com.ericsson.ma.java.misc.jaxp.JaxpDemo;

/**
 * @author honnix
 */
public class ClassLoadingDemo {
    public static void main(String[] args) throws Exception {
        URL[] urls = { new File("test.jar").toURI().toURL() };
        URLClassLoader cl = new URLClassLoader(urls);
        JaxpDemo demo = (JaxpDemo) cl.loadClass(JaxpDemo.class.getName())
                .newInstance();
        System.out.println(demo.getClass().getClassLoader());
    }
}
