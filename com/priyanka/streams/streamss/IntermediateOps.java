package com.priyanka.streams.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {
        // intermediate operations transform a stream into another stream
        // they are lazy, meaning they don't execute until a terminal operation is invoked

        // 1. filter
        List<String> list = Arrays.asList("akshit","ram","shyam","akshit","aarti","ghanshyam","akash");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("a"));
        // no filtering at this point
        long ans = list.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(ans);

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a,b) -> a.length()-b.length());

        // 4. distinct
        System.out.println(list.stream().filter(x -> x.startsWith("a")).distinct().count());

        // 5. limit
        System.out.println(Stream.iterate(1, x -> x+1).limit(100).count());

        // 6. skip
        System.out.println(Stream.iterate(1, x -> x+1).skip(10).limit(100).count());

    }
}
