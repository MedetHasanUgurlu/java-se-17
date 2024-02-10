package org.example.file.pack1;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("data.txt");
        FileInputStream inputStream = new FileInputStream(path.toFile());
        System.out.println(inputStream.readAllBytes().length);

    }

    private static void copyTextFile2() {

    } 

    private static void copyTextFile() {
        Path path = Paths.get("data.txt");
        try (var reader = new BufferedReader(new FileReader(path.toFile())); var writer = new BufferedWriter(new FileWriter("test.txt"))) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
