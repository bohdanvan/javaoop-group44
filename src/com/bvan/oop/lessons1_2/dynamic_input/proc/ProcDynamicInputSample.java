package com.bvan.oop.lessons1_2.dynamic_input.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicInputSample {

    public static void main(String[] args) {
        int[] clientElems = readClientElemsFromConsole();
        System.out.println(Arrays.toString(clientElems));
    }

    private static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] clientElems = new int[10];
        int size = 0;

        int n = readInt(scanner);
        while (n != 0) {
            if (size == clientElems.length) {
                clientElems = Arrays.copyOf(clientElems, clientElems.length*2);
            }
            clientElems[size++] = n;

            n = readInt(scanner);
        }
        return Arrays.copyOf(clientElems, size);
    }

    private static int readInt(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next();

            System.out.println("Sorry, Illegal input");
            System.out.print(">> ");
        }
        return scanner.nextInt();
    }
}
