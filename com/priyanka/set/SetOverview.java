package com.priyanka.set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contain duplicate elements
        // faster operations
        // Map --> HashMap, LinkedHashMap, TreeMap, EnumMap
        // Set --> HashSet, LinkedHashSet, TreeSet, EnumSet
        //Set<Integer> set = new HashSet<>();  // it will not maintain the order in which elements are inserted
        //Set<Integer> set = new LinkedHashSet<>();  // it will maintain the order in which elements are inserted
        //Set<Integer> set = new TreeSet<>(); // if we want elements in sorted manner
        NavigableSet<Integer> set = new TreeSet<>();
        set.add(12);
        set.add(1);
        set.add(1);
        set.add(67);
        System.out.println(set);
        //set.higher(87);
        System.out.println(set.contains(12));
        System.out.println(set.remove(67));
        set.clear();
        System.out.println(set.isEmpty());
        for (int i:set){
            System.out.println(i);
        }


        // Collections is a static class
        // synchronizedSet kerta kya h ?? -> ye external synchronization kerta h mtlb jo set or iske methods h vo wrap ho jayega synchronized block me or sare operations blocking h, agar ek thread h toh dusra aayega nhi, yani yaha performance h hi nhi
        // isliye iska istemal toh mt hi kerna
        //Set<Integer> integers = Collections.synchronizedSet(set);

        // for thread safety
        Set<Integer> set1 = new ConcurrentSkipListSet<>();

        /*Set<Integer> syncSet = Collections.synchronizedSet(new TreeSet<>());

        synchronized (syncSet){
            for(Integer i : syncSet){
                // safe iteration
                System.out.println(i);
            }
        }*/

        // unmodifiable
        Set<Integer> integers = Set.of(1,2,3,4,5,6,7,8,9,54,4323,545,4545);



        /*
        Map<Integer,String> map = new HashMap<>();
        Set<Integer> integers = map.keySet();
        */



    }
}
