package com.ericsson.ma.javatraining.resource;

import java.util.List;
import java.util.ArrayList;

public class Designer extends Resource {
    public Designer() {
        super();
    }

    @Override
    @SuppressWarnings("unchecked")
    public String work() {
        List todo = new ArrayList();
        todo.add("design");
        todo.add("reading");
        System.out.println(todo);
        return "working";
    }
}
