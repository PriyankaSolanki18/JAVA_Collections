package com.priyanka.map.hashmap.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {
    public static void main(String[] args) {
        //ConcurrentHashMap implement kerta h ConcurrentMap ko
        ConcurrentHashMap<String,Integer> map = new ConcurrentHashMap<>();
        // in Java 7 --> segment based locking --> jo map h vo (16 segments) divide ho jayega --> smaller HashMap hote h ye
        // only the segment being written to or read from is locked, each segment has its independent lock.
        // read : do not require locking unless there is a write operation happening on the same segment.
        // write operation : will lock the segment

        // in Java 8 --> no segmentation
        //           --> compare and swap approach --> no locking except resizing or collision
        // thread A last seen --> x = 42
        // thread A work --> z to 50
        // During CAS (Compare and swap) if x is still 42, then change it to 50 else don't change and retry agar loop chalta h jaa rha h toh mtlb cas fail ho rha h toh thread thoda wait kerta h (short random time ke baad retry kerta h) jisse ki cpu wastage na ho
        // put --> index
    }
}
