package org.example.file.pack1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        final var bufferedInputStream = new BufferedReader(new FileReader("ads.txt") {
        });
        System.out.println(bufferedInputStream.read());
    }
}
