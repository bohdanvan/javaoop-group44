package com.bvan.oop.lessons5_6.enum_sample.good;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class GenderInputByIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter gender");
        printGendersInputInfo();
        System.out.print(">> ");

        int genderIndex = scanner.nextInt();
        if (!isGenderIndex(genderIndex)) {
            System.out.println("Illegal gender index");
            return;
        }

        Gender gender = Gender.values()[genderIndex];
        System.out.println("Your gender is " + gender);
    }

    private static boolean isGenderIndex(int genderIndex) {
        return genderIndex >= 0
                && genderIndex < Gender.values().length;
    }

    private static void printGendersInputInfo() {
        Gender[] genders = Gender.values();
        for (Gender gender : genders) {
            System.out.println(gender.name() + " = " + gender.ordinal());
        }
    }
}
