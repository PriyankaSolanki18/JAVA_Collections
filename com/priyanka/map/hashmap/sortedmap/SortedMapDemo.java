package com.priyanka.map.hashmap.sortedmap;

import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        /*
         * SortedMap is an interface and TreeMap is its implementation.
         * SortedMap guarantees that the entries are sorted based on the keys,
         * either in their natural ordering or by a specified Comparator.
         *
         * TreeMap ki internal implementation me RedBlack tree hota h - slef balancing BST
         *
         */

        /*
        * NavigableMap extends SortedMap, providing more powerful navigation options such as finding the closest matching key or retrieving the map in reverse order
        *
        * SortedMap and NavigableMap are both interfaces and TreeMap is implementation of NavigableMap in turn SortedMap's also
        */
                                                      //To print elements in descending order we used comparator logic to compare sortedMap elements
        SortedMap<Integer,String> map = new TreeMap<>((a,b)->b-a);
        map.put(91,"vivek");
        map.put(99,"shubham");
        map.put(78,"mohit");
        map.put(77,"raj");
        System.out.println(map);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap(91));  // 91 tk ka data chahiye but 91 vala include nhi hoga
        System.out.println(map.tailMap(91));  // 91 se lekar end tk ka data chahiye isme 91 bhi include hoga
//        System.out.println(map.subMap(78,91));

        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"one");
        navigableMap.put(5,"five");
        navigableMap.put(3,"three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(4));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());

        // Optional: Print the map to see the sorted order
        /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }*/
    }
}
