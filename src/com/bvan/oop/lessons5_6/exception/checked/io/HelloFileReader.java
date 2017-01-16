package com.bvan.oop.lessons5_6.exception.checked.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloFileReader {

    public static void main(String[] args) {
        try {
            String helloMessage = readMessageFromFile("files/hello.txt");
            System.out.println(helloMessage);
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, file not found: " + e.getMessage());
        }
        System.out.println("Goodbye");
    }

    public static String readMessageFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        String message = scanner.nextLine();
        scanner.close();

        return message;
    }
}
