package org.example.chapter10;

public class Deneme {
    public static void main(String[] args) {
        FII:for (int k = 0; k < 2; k++) {
            TEST:for (int j = 0; j < 3; j++) {
                System.out.println();
                SSSS:for (int i = 0; i < 10; i++) {
                    if (i == 5) {
                        break;
                    }
                    System.out.print(i + "\t");
                }
                System.out.println("foo");
            }
        }
        System.out.println("bar");
    }
}
