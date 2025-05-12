package com.priyanka.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        /* we don't have to do it manually like this
        Node node1 = new Node();
        Node node2 = new Node();
        node1.value = 1;
        node1.next = node2;
        node2.value = 2;
        node2.next = null;
        */
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        linkedList.get(2); //T.C : O(n)

        linkedList.addLast(4);

        linkedList.addFirst(0);

        linkedList.getFirst();

        linkedList.getLast();

        System.out.println(linkedList);

        linkedList.removeIf(x -> x%2 == 0);

        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","dog","elephant"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("dog","cat","rabbit"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}

class Node{
    public int value;
    public Node next;
}
