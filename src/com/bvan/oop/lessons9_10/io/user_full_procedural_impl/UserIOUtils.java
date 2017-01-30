package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

import java.io.*;

/**
 * Procedural Utility Class.
 *
 * @author bvanchuhov
 */
public class UserIOUtils {

    private static final String CSV_DELIMITER = ";";

    private UserIOUtils() {}

    // Binary Output

    /**
     * @throws IOException
     */
    public static void writeUsersIntoBinFile(String fileName, Users users) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(users);
        }
    }

    // Binary Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static Users readUsersFromBinFile(String fileName) throws IOException {
        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Users)objectInput.readObject();
        } catch (ClassNotFoundException e) {
            throw new IllegalFormatException("illegal bin format", e);
        }
    }

    // Text Output

    /**
     * @throws IOException
     */
    public static void writeUsersIntoFile(String fileName, Users users) throws IOException {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(fileName))) {
            for (User user : users) {
                printWriter.println(toOutputString(user));
            }
        }
    }

    private static String toOutputString(User user) {
        return user.getId() + CSV_DELIMITER + user.getFullName() + CSV_DELIMITER + user.getAge();
    }

    // Text Input

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    public static User readUserFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readUser(reader);
        }
    }

    public static Users readUsersFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            return readUsers(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Users readUsers(BufferedReader reader) throws IOException {
        Users users = new Users();

        String s;
        while ((s = reader.readLine()) != null) {
            if (s.equals("")) {
                continue;
            }

            User user = parseUser(s);
            users.add(user);
        }

        return users;
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static User readUser(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return parseUser(line);
    }

    /**
     * @throws IllegalFormatException
     */
    private static User parseUser(String s) {
        String[] tokens = s.split(CSV_DELIMITER); // ["John", "25"]

        if (tokens.length != 2) {
            throw new IllegalFormatException("must be 2 values: " + s);
        }

        return new User.Builder()
                .setName(tokens[0])
                .setAge(Integer.parseInt(tokens[1])) // TODO: can be exception
                .build();
    }
}
