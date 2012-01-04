package com.ericsson.ma.javatraining.resource;

public abstract class Resource {
    protected String id;

    protected String name;

    protected String gender;

    protected String unit;

    public Resource parse(String rep) {
        return null;
    }

    public Resource() {
        super();
        System.out.println("Resource");
    }

    public Resource(String name) {
        System.out.println("Resource with name");
        this.name = name;
    }

    public Resource withName(String name) {
        this.name = name;
        return this;
    }

    public Resource withId(String id) {
        this.id = id;
        return this;
    }

    public Resource withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Resource withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public abstract String work();
}
