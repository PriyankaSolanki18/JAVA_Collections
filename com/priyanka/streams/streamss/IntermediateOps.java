package com.priyanka.streams.streamss;

import java.util.Arrays;
import java.util.Comparator;
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

        // 7. peek
        // Perform an action on each element as it is consumed
        Stream.iterate(1,x -> x+1).skip(10).limit(100).peek(System.out::println).count();

        // 8. toArray() --> stream ko array me convert kerna ho toh
        Object[] array = Stream.of(1,2,3).toArray();
        System.out.println("array : "+array[1]);

        // 9. min / max
        System.out.println("max :"+Stream.of(2,44,689,21).max((a,b) -> a-b));
        System.out.println("max :"+Stream.of(2,44,689,21).max((o1,o2) -> o2-o1)); // iss case me bhi minimum hi aayega bhale hi hamne max function use kiya h
        System.out.println("max :"+Stream.of(2,441,69,21).max(Comparator.naturalOrder()));
        System.out.println("min :"+Stream.of(12,41,89,21).min((a,b) -> b-a));
        System.out.println("min :"+Stream.of(12,441,9,21).min(Comparator.naturalOrder()));

        // 10. flatMap
        // handle streams of collections, lists, or arrays where each element is itself a collection
        // flatten nested structures (e.g., lists within lists) so that they can be processed as a single sequence of elements
        // transform and flatten elements at the same time
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple","banana"),
                Arrays.asList("orange","kiwi"),
                Arrays.asList("pear","grape")
        );
        System.out.println(listOfLists.get(1).get(1));
        System.out.println(listOfLists.stream().flatMap(x -> x.stream()).map(String::toUpperCase).toList());

        //E.g.,
        List<String>  sentences = Arrays.asList(
                "Hello world",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences
                .stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList());

        // 11. forEachOrdered
        List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("using forEach with parallel stream");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.println("using forEachOrdered with parallel stream");
        numbers0.parallelStream().forEachOrdered(System.out::println);
    }
}
