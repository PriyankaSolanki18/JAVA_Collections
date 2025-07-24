package com.priyanka.queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        //double ende queue
        //allows insertion and removal of elements from both ends
        //versatile than regular queues and stacks because they support all the operations of both

        /*
        INSERTION METHODS

        addFirst(E e) : Inserts the specified element at the front.
        addLast(E e) : Inserts the specified element at the end
        offerFirst(E e) : Inserts the specified element at the front if possible
        offerLast(E e) : Inserts the specified element at the end if possible
        */

        /*
        REMOVAL METHODS

        removeFirst() : Retrieves and removes the first element
        removeLast() : Retrieves and removes the last element
        pollFirst() : Retrieves and removes the first element, or returns null if empty
        pollLast() : Retrieves and removes the last element, or returns null if empty
        */

        /*
        EXAMINATION METHODS

        getFirst() : Retrieves but does not remove the first element
        getLast() : Retrieves but does not remove the last element
        peekFirst() : Retrieves but does not remove the first element or returns null if empty
        peekLast() : Retrieves but does not remove the last element or returns null if empty
        */

        /*
        STACK METHODS

        push(E e) : Adds an element at the front (equivalent to addFirst(E e))
        pop() : Removes and returns the first element (equivalent to removeFirst())
        */

        Deque<Integer> deque1 = new ArrayDeque<>();  // faster iteration - because of contiguous memory allocation in array, low memory as we don't have to store pointers, no null allowed
        // yaha jo internal array h vo circular hoti h isliye hame elements khiskane ki zarurat nhi padti, do pointers honge head and tail unko khiskate rehte h ham actual me elements ko khiskane ki zarurat nhi padti
        // no need to shift elements, just shift head and tail
        deque1.addFirst(10);
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        // 5, 10, 20, 25
        System.out.println(deque1);
        System.out.println("First element : "+deque1.getFirst()); //output: 5
        System.out.println("Last element : "+deque1.getLast()); //output: 25
        deque1.removeFirst(); // removes 5
        deque1.pollLast(); //removes 25
        // current Deque : [10,20]
        for(int num:deque1){
            System.out.println(num);
        }

        Deque<Integer> deque2 = new LinkedList<>();  // preferred to use when - insertion, deletion in the middle

    }
}
