package com.priyanka.map.hashmap.concurrentskiplistmap;


import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String,Integer> map = new ConcurrentSkipListMap<>();
        map.put("Priyanka",18);
        map.put("Agrata",12);
        map.put("Charcha",10);
        map.put("Bhumika",20);
        System.out.println(map);
    }
}

/*
* ConcurrentSkipListMap : SkipList data structure use kerta h
*                       --> sorted manner me cheeze store hoti h, concurrency ham achieve ker rahe h
*  (can be viwed as synchronized or thread safe TreeMap)
*
*
* SkipList : is a probabilistic data structure, that allows for efficient search, insertion and deletion operations.
*            It is similar to a sorted linked list but with multiple layers that "skip" over portions of the list to provide faster access to elements.
* E.g; 1,2,3,4,5,6,7,8,9
*
* SkipList data structure will divide it into multiple layers in which each layer will skip some of the elements for better search win T.C log(N)
* Layer-3 : 1-----------5--------------9
* Layer-2 : 1----3------5------7-------9
* Layer-1 : 1,2,3,4,5,6,7,8,9
* */