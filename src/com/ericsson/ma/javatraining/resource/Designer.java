package com.ericsson.ma.javatraining.resource;

import java.util.List;
import java.util.ArrayList;

public class Designer extends Resource {
    public Designer() {
        super();
    }

    public Designer(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object other) {
        Resource resource = (Resource) other;
        return id.equals(resource.id) && name.equals(resource.name) && gender.equals(resource.gender) && unit.equals(resource.unit);
    }

    @Override
    public String toString() {
        return String.format("Designer:%s,%s,%s,%s", id, name, gender, unit);
    }
}
