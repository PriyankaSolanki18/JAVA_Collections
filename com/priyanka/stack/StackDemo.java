package com.priyanka.stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        Integer removedElement = stack.pop();
        System.out.println(stack);
        Integer peek = stack.peek();
        System.out.println(peek);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());

        int search = stack.search(3);
        System.out.println(search);
        //1-based indexing starting from top of the stack
        //4 - at index 1
        //3 - 2
        //2 - 3
        //1 - 4


        //linkedlist as stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.getLast(); // it is equivalent to peek()
        linkedList.removeLast(); //pop()
        linkedList.isEmpty();
        linkedList.size();

        //arraylist as stack - ker sakte h stack implementation but arraylist bani hi nhi h stack implementation ke iye
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.get(arrayList.size() - 1); //peek
        arrayList.remove(arrayList.size() - 1); //pop

    }
}
