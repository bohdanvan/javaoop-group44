package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

import java.io.IOException;

import static com.bvan.oop.lessons9_10.io.user_full_procedural_impl.UserIOUtils.readUsersFromFile;
import static com.bvan.oop.lessons9_10.io.user_full_procedural_impl.UserIOUtils.writeUsersIntoBinFile;
import static com.bvan.oop.lessons9_10.io.user_full_procedural_impl.UserIOUtils.writeUsersIntoFile;

/**
 * @author bvanchuhov
 */
public class UsersIORunner {

    public static final String TEXT_INPUT_FILE = "files/users/users-in.csv";
    public static final String TEXT_OUTPUT_FILE = "files/users/users-out.csv";

    public static final String BIN_FILE = "files/users/users.dat";

    public static void main(String[] args) {
        try {
            Users users = readUsersFromFile(TEXT_INPUT_FILE);
            writeUsersIntoFile(TEXT_OUTPUT_FILE, users);

            writeUsersIntoBinFile(BIN_FILE, users);
        } catch (IOException e) {
            System.out.println("Sorry, IO Error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, format error: " + e.getMessage());
        }
    }
}
