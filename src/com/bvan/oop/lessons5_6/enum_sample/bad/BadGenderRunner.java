package com.bvan.oop.lessons5_6.enum_sample.bad;

import static com.bvan.oop.lessons5_6.enum_sample.bad.BadPerson.MALE;

/**
 * @author bvanchuhov
 */
public class BadGenderRunner {

    public static void main(String[] args) {
        BadPerson person = new BadPerson("John", 25, MALE);
        String genderName = person.getGenderName();

        System.out.println(person);
        System.out.println("genderName = " + genderName);
    }
}
