package com.ericsson.ma.javatraining;

public class MemoryLeak {
    private static final int SIZE = 100;

    private Object[] stack;

    private int position;

    private MemoryLeak() {
        super();

        stack = new Object[SIZE];
    }

    public void push(Object object) {
        stack[position++] = object;
    }

    public Object pop() {
        return stack[--position];
    }

    public static void main(String[] args) {
        MemoryLeak ml = new MemoryLeak();

        for (int i = 0; i < 80; ++i) {
            ml.push(i);
        }

        for (int i = 0; i < 80; ++i) {
            ml.pop();
        }

        ml.push(1);
        ml.pop();

        ml.push(1);
        ml.pop();

        ml.push(1);
        ml.pop();

        ml.push(1);
        ml.pop();
    }
}
