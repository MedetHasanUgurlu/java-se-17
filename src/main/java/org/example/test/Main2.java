package org.example.test;

public class Main2 {
    public static void main(String[] args) {
        extractInt(2.7);
        extractInt(2d);

        byte var =  127;
        System.out.println(++var);
    }

    private static void extractInt(Double obj) {
        System.out.println(obj.intValue());
    }
}
