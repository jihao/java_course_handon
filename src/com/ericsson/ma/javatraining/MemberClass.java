package com.ericsson.ma.javatraining;

public class MemberClass {
    public class FirstClass {
        public FirstClass() {
            super();
            System.out.println(MemberClass.this);
        }
    }
}
