package com.priyanka.queues;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        //PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> x-y); // x-y : ascending order , y-x : descending order
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        /*System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());*/
        System.out.println(pq); //not sorted order
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        //internal working
        //priority queue is implemented as a min-heap by default (for natural ordering)


    }
}
