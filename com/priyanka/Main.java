package com.priyanka;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        List<Integer> arraylist = new ArrayList<>();

        //add
        list.add(18);
        list.add(11);
        list.add(29);

      /*
        System.out.println(list.get(1));
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        for(int x:list){
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.println(list.contains(18));
        System.out.println(list.contains(8));

     // to insert element in between of elemets
        list.add(2,80);
        */

        // to replace an element with other element
        list.set(2,374);
        System.out.println(list);

        ArrayList<Integer> l = new ArrayList<>(1000);
        System.out.println(l.size());  // O/P : 0
//        System.out.println(l.get(0));  index out of bound exception

        List<String> l1 = new ArrayList<>();
        System.out.println(l1.getClass().getName());

        List<String> l2 = Arrays.asList("Mon","Tue");
        System.out.println(l2);
        System.out.println(l2.getClass().getName());
       //cant add -> l2.add("wed");
        l2.set(1,"wed");
        System.out.println(l2);

        String[] arr = {"Apple","banana","Cherry"};
        List<String> l3 = Arrays.asList(arr);
        System.out.println(l3);
        System.out.println(l3.getClass().getName());

        List<String> l5 = new ArrayList<>(l3);
        l5.add("mango");
        l5.add(1,"chikooo");
        System.out.println(l5);

        // unmodifiable list
        List<Integer> l4 = List.of(1,2,3,4,9,0);
        System.out.println(l4);

        List<Integer> l6 = new ArrayList<>();
        l6.add(1);
        l6.add(2);
        l6.add(3);
        System.out.println(l6);

        List<Integer> l7 = List.of(4,5,7,8,9);

        l6.addAll(l7);
        System.out.println(l6);


        List<String> fruits = new ArrayList<>();
        fruits.add("seb");
        fruits.add("kela");
        fruits.add("angur");
        fruits.remove(1);
        System.out.println(fruits);


        List<Integer> ll = new ArrayList<>();
        ll.add(6);
        ll.add(0);
        ll.add(3);
        //since remove method take Object as parameter and we just give '1' as parameter then it will consider it as index and remove element at index 1 and not the element 1 to remove the element 1 at 0 index we convert its instance to Wrapper class
        ll.remove(Integer.valueOf(1));
        System.out.println(ll);

        //converting list to array
        Object[] array = ll.toArray();
        Integer[] array1 = ll.toArray(new Integer[0]);

        //sort ArrayList
//        Collections.sort(ll);
        ll.sort(null);
        System.out.println(ll);

     }
}
