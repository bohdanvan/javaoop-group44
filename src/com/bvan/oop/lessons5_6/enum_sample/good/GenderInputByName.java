package com.bvan.oop.lessons5_6.enum_sample.good;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class GenderInputByName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter gender " + Arrays.toString(Gender.values()) + ": ");
        String genderName = scanner.next().toUpperCase();

        if (!Gender.isGender(genderName)) {
            System.out.println("Illegal gender: " + genderName);
            return;
        }

        Gender gender = Gender.valueOf(genderName);
        System.out.println("Your gender is " + gender);
    }
}
