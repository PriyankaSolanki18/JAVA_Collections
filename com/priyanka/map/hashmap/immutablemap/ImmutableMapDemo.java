package com.priyanka.map.hashmap.immutablemap;

import java.util.*;

public class ImmutableMapDemo {
    public static void main(String[] args) {
        // vo map jiske content ko ham modify nhi ker skte once it is instantiated, ham add, update, remove nhi ker skte
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String,Integer> map2 = Collections.unmodifiableMap(map1);
        //map2.put("C",3): //throws exception

        //Below is a clean way to create unmodifiableMap or ImmutableMap
        // Map.of() has limitation that it can accomodate only 10 key value pairs agar uuse zayda kerne h toh uske liye alag method h Map.ofEntries()
        Map<String,Integer> map3 = Map.of("Shubham",98,"vivek",89);
        //map3("Akshit",88);
        Map.ofEntries(Map.entry("Akshit",99),Map.entry("Vivek",80));
    }
}
