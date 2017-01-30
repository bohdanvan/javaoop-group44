package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(10L, new Person("John", 25));
        idToUserMap.put(200L, new Person("Phil", 30));
        idToUserMap.put(300L, new Person("Bob", 20));
        idToUserMap.put(1000L, null);

        System.out.println(idToUserMap.containsKey(20L)); // false
        System.out.println(idToUserMap.get(20L)); // null
        System.out.println();

        System.out.println(idToUserMap.containsKey(1000L)); // true
        System.out.println(idToUserMap.get(1000L)); // null
        System.out.println();

        Person prevUser = idToUserMap.put(10L, new Person("Masha", 18));
        System.out.println(idToUserMap.get(10L));
        System.out.println("prevUser = " + prevUser);

        System.out.println(idToUserMap.containsValue(new Person("John", 25))); // BAD PERFORMANCE
        System.out.println();

        Set<Long> keys = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();

        System.out.println("Entries:");
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            System.out.println(entry);
        }
    }
}
