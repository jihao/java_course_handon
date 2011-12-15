package com.ericsson.ma.javatraining;

public class Operator {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        System.out.println(a.equals(b));
        System.out.println(a == b);

        String a1 = new String("hello");
        String b1 = new String("hello");

        System.out.println(a1.equals(b1));
        System.out.println(a1 == b1);

        System.out.println(a1 instanceof String);
    }
}
