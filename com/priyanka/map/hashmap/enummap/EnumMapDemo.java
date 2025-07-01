package com.priyanka.map.hashmap.enummap;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        /*
        * array of size same as enum
        [walk,gym,_,_,_,_,_]
        * no hashing
        * ordinal/index is used
        * faster than HashMap and memory efficient
        * */
        Map<Day,String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY,"Gym");
        map.put(Day.MONDAY,"Walk");
        System.out.println(Day.TUESDAY.ordinal());
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

/*
* If all the keys in a Map are values from a single enum, it is recommended to use an EnumMap
* as the specific implementation. An EnumMap which has the advantage of knowing all possible keys
* in advance, is more efficient compare to other implemntation as it can use a simple array as its
* underlying data strucutre.
* */
