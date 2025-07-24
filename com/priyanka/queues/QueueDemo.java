package com.priyanka.queues;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        //Queue implementation using List
        //Enqueue operation : putting elements in queue from end
        list.addLast(1);  //enqueue
        list.addLast(2);  //enqueue
        list.addLast(3);  //enqueue
        System.out.println(list);
        Integer i = list.removeFirst();  //dequeue : removing elements from the front of queue
        System.out.println(list+" --> item removed from front : "+i);
        Integer first = list.getFirst();  //peek : to see element present at the front
        System.out.println(list+" --> Element at front : "+first);

        /*
        NOTE : Queue ki implementation classes : LinkedList, Priority Queue
        Queue - FIFO
        Methods :-
        --> enqueue : 'add' similar to it 'offer'
        --> dequeue : 'remove' similar to it 'poll'
        --> peek : 'peek' similar to it 'element'
        */
        Queue<Integer> queue1 = new LinkedList<>();
        queue1.add(1);
        System.out.println(queue1.size());

        System.out.println(queue1.remove());  // throws exception if empty
        System.out.println(queue1.poll());  // better - depend on use case

        //System.out.println(queue1.element());  // throws exception if empty
        System.out.println(queue1.peek());

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));  //true
        System.out.println(queue2.offer(2));  //true
        //queue2.add(3); //throws exception : queue full
        System.out.println(queue2.offer(3));  // this will not throw exception and give output : false


        /*
        //Stack implementation using List
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(69);
        list.removeFirst();
        */

    }
}
