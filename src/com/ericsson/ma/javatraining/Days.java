package com.ericsson.ma.javatraining;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Days {
    public static void main(String[] args) throws IOException {
        System.out.print("# ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while (!"quit".equals(input)) {
            switch (Integer.parseInt(input)) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                System.out.println("28 or 29");
                break;
            }
            System.out.print("# ");
            input = br.readLine();
        }
    }
}
