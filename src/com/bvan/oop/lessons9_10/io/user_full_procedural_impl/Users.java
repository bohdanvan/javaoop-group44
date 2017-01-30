package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Users implements Iterable<User>, Serializable {

    private final List<User> users = new ArrayList<>();

    public void add(User user) {
        users.add(user);
    }

    public void printIntoConsole() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Override
    public Iterator<User> iterator() {
        return users.iterator();
    }
}
