package com.bvan.oop.lessons1_2.dynamic_input.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ConsoleReader {

    private Scanner scanner = new Scanner(System.in);

    public int readInt() {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("Sorry, Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
