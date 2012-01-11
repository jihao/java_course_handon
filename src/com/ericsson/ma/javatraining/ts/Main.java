package com.ericsson.ma.javatraining.ts;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        List<BigObject> list = new ArrayList<BigObject>();

        while (true) {
            list.add(new BigObject());

            Thread.sleep(1000);
        }
    }

    private Main() {
        super();
    }
}
