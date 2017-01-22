package com.bvan.oop.lesssons7_8.generics.swapper;

import com.bvan.oop.common.Person;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SwapperRunner {

    public static void main(String[] args) {
        Person[] people = {
                new Person("John", 25),
                new Person("Bob", 30)
        };

        Swapper.swapGenerics(people, 0, 1);
        System.out.println(Arrays.toString(people));
    }
}
