package com.ericsson.ma.javatraining;

import java.util.List;
import java.util.ArrayList;

public class For {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        for (int a : array) {
            System.out.println(a);
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
