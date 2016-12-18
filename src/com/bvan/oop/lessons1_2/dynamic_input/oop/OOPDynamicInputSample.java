package com.bvan.oop.lessons1_2.dynamic_input.oop;

/**
 * @author bvanchuhov
 */
public class OOPDynamicInputSample {

    public static void main(String[] args) {
        DynamicArray clientElems = readClientElemsFromConsole();
        System.out.println(clientElems);
    }

    private static DynamicArray readClientElemsFromConsole() {
        ConsoleReader consoleReader = new ConsoleReader();
        DynamicArray clientElems = new DynamicArray();

        int n;
        while ((n = consoleReader.readInt()) != 0) {
            clientElems.add(n);
        }
        return clientElems;
    }
}
