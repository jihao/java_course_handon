package com.ericsson.ma.javatraining;

import java.util.*;
import com.ericsson.ma.javatraining.resource.*;

public class Main {
    private static <T> List<T> hello(T word) {
        List<T> list = new ArrayList<T>();
        list.add(word);
        return list;
    }

    public static void main(String[] args) {
        Resource resource = new Designer();
        resource.setName("honnix");
        resource.setId("ehonlia");
        resource.setGender("male");
        resource.setUnit("xlef");

        List<Resource> list = new ArrayList<Resource>();
        list.add(resource);

        hello("world");
        hello(1);

        // Resource resource1 = new Designer("honnix");
        // resource1.setId("ehonlia");
        // resource1.setGender("male");
        // resource1.setUnit("xlef");

        // System.out.println(list.contains(resource1));
    }
}
