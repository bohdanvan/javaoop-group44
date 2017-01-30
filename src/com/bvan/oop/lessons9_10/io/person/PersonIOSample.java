package com.bvan.oop.lessons9_10.io.person;

import com.bvan.oop.common.Person;

import java.io.*;

/**
 * @author bvanchuhov
 */
public class PersonIOSample {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("files/people/people.csv"))) {
            String line = reader.readLine();
            Person person = parsePerson(line);

            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static Person parsePerson(String line) {
        String[] tokens = line.split(";");
        if (tokens.length < 2) {
            throw new IllegalFormatException("number of values < 2: " + line);
        }

        String name = tokens[0];
        if (!isInt(tokens[1])) {
            throw new IllegalFormatException("illegal age: " + tokens[1]);
        }
        int age = Integer.parseInt(tokens[1]);
        return new Person(name, age);
    }

    private static boolean isInt(String token) {
        return true; // TODO
    }
}
