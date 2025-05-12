package com.priyanka.vector;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //we can give initial capacity as well like (by default the capacity is 10):
        //Vector<Integer> vector = new Vector<>(11);

        //1.
        Vector<Integer> vector = new Vector<>();
        System.out.println(vector.capacity());

        //2.
        Vector<Integer> v1 = new Vector<>(5,3);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        System.out.println(v1.capacity()); //5
        v1.add(6);
        v1.add(7);
        v1.add(8);
        System.out.println(v1.capacity()); //5+3
        v1.add(9);
        System.out.println(v1.capacity()); //8+3

        //3.
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        Vector<Integer> v2 = new Vector<>(ll);
        System.out.println(v2);
        for(int i=0;i<v2.size();i++){
            System.out.print(v2.get(i)+" ");
        }

        System.out.println();

        ll.clear();
        System.out.println(ll);

        v2.clear();
        System.out.println(v2);


        //ArrayList<Integer> list = new ArrayList<>();
        Vector<Integer> list = new Vector<>(); //we will always get size as 2000 because vector are thread safe
        Thread t1 = new Thread(() -> {
            for(int i=0;i<1000;i++) {
                list.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
           for(int i=0;i<1000;i++){
               list.add(i);
           }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Size of list : "+list.size()); //idealy output should be 2000 but we are getting different output every time this is because : ArrayList is not synchronized mtlb thread safe nhi h mtlb ek hi time per dono thread t1 and t2 access ker rahe h list ko or ek hi time per add ker rahe h

    }
}
