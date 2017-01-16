package com.bvan.oop.lessons5_6.enum_sample.good;

/**
 * @author bvanchuhov
 */
public class EnumSample {

    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        System.out.println(gender.name());
        System.out.println(gender.ordinal());
    }
}
