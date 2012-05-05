package com.ericsson.ma.javatraining.resource;

public final class ResourceBuilder {
    public static Tester buildTester(String name, String id, String gender, String unit) {
        return (Tester) new Tester().withName(name).withId(id).withGender(gender).withUnit(unit);
    }

    public static Designer buildDesigner(String name, String id, String gender, String unit) {
        return (Designer) new Designer().withName(name).withId(id).withGender(gender).withUnit(unit);
    }

    private ResourceBuilder() {
        super();
    }
}
