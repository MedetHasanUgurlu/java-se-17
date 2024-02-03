package org.example.chapter8.pac2;

public class Main2 {
    public static void main(String[] args) {
        String test = "test";
        StringChecker stringChecker = String::isEmpty;
        System.out.println(stringChecker.check(test));

    }
}
