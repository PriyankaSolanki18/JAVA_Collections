package com.priyanka.set;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        // thread-safe
        // copy-on-write mechanism
        // no duplicate elements
        // iterators do not reflect modifications
        CopyOnWriteArraySet<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for(int i=1;i<=5;i++){
            copyOnWriteArraySet.add(i);
            concurrentSkipListSet.add(i);
        }

        System.out.println("Initial CopyOnWriteArraySet : "+copyOnWriteArraySet);
        System.out.println("Initial ConcurrentSkipListSet : "+concurrentSkipListSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for(Integer num : copyOnWriteArraySet){
            System.out.println("Reading from CopyOnWriteArraySet : "+num);
            //Attempting to modify the set during iteration
            copyOnWriteArraySet.add(6);
        }
        System.out.println(copyOnWriteArraySet);

        // We call ConcurrentSkipListSet weakly consistent because when we are iterating it might reflect or might not
        System.out.println("\nIterating and modifying ConcurrentSkipList:");
        for(Integer num : concurrentSkipListSet){
            System.out.println("Reading from ConcurrentSkipList : "+num);
            //Attempting to modify the set during iteration
            //if(num == 5){
                concurrentSkipListSet.add(6);
            //}
        }
        System.out.println(concurrentSkipListSet);

    }
}
