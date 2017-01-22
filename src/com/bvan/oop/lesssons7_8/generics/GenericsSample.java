package com.bvan.oop.lesssons7_8.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericsSample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");

        String s = names.get(1);
        System.out.println(s);
    }
}

class Dog {}
