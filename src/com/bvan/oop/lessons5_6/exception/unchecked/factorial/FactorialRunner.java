package com.bvan.oop.lessons5_6.exception.unchecked.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        BigInteger factorial = Factorial.factorial(-1);
        System.out.println(factorial);
    }
}
