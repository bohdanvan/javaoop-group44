package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

/**
 * @author bvanchuhov
 */
public class UserRunner {

    public static void main(String[] args) {
        User john = new User.Builder()
                .setName("John")
                .setAge(25)
                .build();

        System.out.println(john);

    }
}
