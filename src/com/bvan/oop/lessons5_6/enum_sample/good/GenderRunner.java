package com.bvan.oop.lessons5_6.enum_sample.good;

/**
 * @author bvanchuhov
 */
public class GenderRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25, Gender.MALE);
        System.out.println(person);

        String genderName = person.getGenderName();
        System.out.println("genderName = " + genderName);
    }
}
