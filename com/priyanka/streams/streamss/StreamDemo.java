package com.priyanka.streams.streamss;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // Stream is a feature in Java 8
        // process collection of data in a functional and declarative manner
        // simplify data processing
        // embrace functional programming
        // improve readability and maintainability
        // enable easy parallelism

        // what is stream ?
        // a sequence of elements supporting functional and declarative programming

        // how to use streams ?
        // source,  intermediate operations & terminal operations

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        //Stream<Integer> stream = numbers.stream();
        System.out.println(numbers.stream().filter(x -> x%2 == 0).count());

        //creating streams
        // 1. from Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();

        // 2. from Arrays
        String[] arr = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(arr);

        // 3. using Stream.of()
        Stream<String> stream3 = Stream.of("a","b","c","d");

        // 4.infinite streams : two methods -> generate() and iterate()
        Stream<Integer> generate = Stream.generate(() -> 1);  //infinite
        //Stream<Integer> generate = Stream.generate(() -> 1).limit(100);  //definite i.e; 100

        List<Integer> collect = Stream.iterate(1, x -> x+1).toList();
        //List<Integer> collect = Stream.iterate(1,x -> x+1).limit(100).collect(Collectors.toList());
        System.out.println(collect);



    }
}
