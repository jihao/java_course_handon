package com.ericsson.ma.javatraining.jardemo.main;

import com.ericsson.ma.javatraining.jardemo.one.JarOne;
import com.ericsson.ma.javatraining.jardemo.two.JarTwo;

public class Main {
    public static void main(String[] args) {
        JarOne one = new JarOne();
        JarTwo two = new JarTwo();

        System.out.println(one.one());
        System.out.println(two.two());
    }

    private Main() {
        super();
    }
}
