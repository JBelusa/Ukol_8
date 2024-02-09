package com.engeto.ukol8.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
@RequestMapping("/reader")
public class FileController {


    @GetMapping("/scifi")
    public String scifi() {
        String filename = "scifi.txt";
        try {
            Path filePath = getPath(filename);
            return Files.readString(filePath);
        } catch (IOException e) {
            return "Soubor " + filename + " nenalezen.";
        }


    }

    @GetMapping("/romantic")
    public String romantic() {
        String filename = "romantic.txt";
        try {
            Path filePath = getPath(filename);
            return Files.readString(filePath);
        } catch (IOException e) {
            return "Soubor " + filename + " nenalezen.";
        }


    }

    @GetMapping("/historic")
    public String historic() {
        String filename = "historic.txt";
        try {
            Path filePath = getPath(filename);
            return Files.readString(filePath);
        } catch (IOException e) {
            return "Soubor " + filename + " nenalezen.";
        }


    }


    private static Path getPath(String filename) {

        return Path.of("src", "main", "resources", "/" + filename);
    }
}
