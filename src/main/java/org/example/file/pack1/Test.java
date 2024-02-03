package org.example.file.pack1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        Path path = Paths.get("data.txt");
        System.out.println(path.toFile().exists());
        try(var reader = new BufferedReader(new FileReader(path.toFile())); var writer = new  BufferedWriter(new FileWriter("test.txt")) ) {
            String line = null;
            while ((line = reader.readLine())!= null){
                writer.write(line);
                writer.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
