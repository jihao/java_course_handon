package com.ericsson.ma.javatraining.ts;

public class BigObject {
    private String data;

    public BigObject() {
        super();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; ++i) {
            sb.append("hello world");
        }
        data = sb.toString();
    }
}
