package com.ericsson.ma.javatraining.resource;

public class Manager extends Resource {
    private static final Manager instance = (Manager) new Manager().withName("").withId("").withGender("").withUnit("");

    public static Manager getInstance() {
        return instance;
    }

    public String work() {
        return "do it";
    }

    private Manager() {
        super();
    }
}
