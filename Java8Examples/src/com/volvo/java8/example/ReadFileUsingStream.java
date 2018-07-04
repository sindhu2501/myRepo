package com.volvo.java8.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFileUsingStream {

    public static void main(String[] args) {
        // Read a file using stream
        // Path path = Paths.get("C:\\Users\\A233818\\Desktop\\Prod.txt");
        Path path = Paths.get("C:\\Users\\A233818\\Desktop\\Prod.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read directory using stream
        Path pathDir = Paths.get("C:\\Users\\A233818\\Desktop\\");
        try (Stream<Path> folders = Files.walk(pathDir)) {
            folders.forEach(folder -> System.out.println(folder));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
