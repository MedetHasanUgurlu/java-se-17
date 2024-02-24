package org.example.test;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        boolean b = Boolean.parseBoolean("abc");
        Boolean b1 = null;
        System.out.println(b);
        m(7l);

    }

    public static void m(Object o){
        System.out.println(o);
    }
    public static void m(Long l){
        System.out.println(l);
    }
}
