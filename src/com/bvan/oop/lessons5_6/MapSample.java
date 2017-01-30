package com.bvan.oop.lessons5_6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class MapSample {

    public static void main(String[] args) {
        Map<Integer, Integer> hashMap = addValues(new HashMap<>());
        System.out.println("hashMap = " + hashMap);

        Map<Integer, Integer> linkedHashMap = addValues(new LinkedHashMap<>());
        System.out.println("linkedHashMap = " + linkedHashMap);

        Map<Integer, Integer> treeMap = addValues(new TreeMap<>());
        System.out.println("treeMap = " + treeMap);
    }

    private static Map<Integer, Integer> addValues(Map<Integer, Integer> map) {
        map.put(10, 0);
        map.put(100, 0);
        map.put(30, 0);
        map.put(2000, 0);
        map.put(10, 1);
        map.put(1000, 0);
        return map;
    }
}
