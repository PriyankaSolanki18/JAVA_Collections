package com.priyanka.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        //Consumer consume kerta h cheezo ko mtlb consume kerta h lekin kuch deta nhi bas use kerta h parameter ko
        Consumer<Integer> print = (x) -> System.out.println(x);
        print.accept(8);

        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> {
          for(int i:x){
              System.out.println(i);
          }
        };
        printList.accept(list);

    }
}
