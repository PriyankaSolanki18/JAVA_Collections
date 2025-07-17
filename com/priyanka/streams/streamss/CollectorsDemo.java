package com.priyanka.streams.streamss;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods yo create common collectors

        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. collecting to a specific Collections
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

        // 4. Joining Strings
        // concatenates stream elements into a single string
        String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(concatenatedNames);

        // 5. summarizing data
        // generates statistical summary (count, sum, min, average, max)
        List<Integer> numbers = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics stats = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : "+stats.getCount());
        System.out.println("Sum : "+stats.getSum());
        System.out.println("Min : "+stats.getMin());
        System.out.println("Average : "+stats.getAverage());
        System.out.println("Max : "+stats.getMax());

        // 6. Calculating Averages
        Double average = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : "+average);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count : "+count);

        // 8. Grouping Elements (V. V. IMP)
        List<String> words = Arrays.asList("hello","world","java","streams","collecting");
        // 1st signature :-
        System.out.println(words.stream().collect(Collectors.groupingBy(x -> x.length())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

        // 2nd signature :-
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining())));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));


        // 3rd signature :-
        TreeMap<Integer,Long> collect1 =  words.stream().collect(Collectors.groupingBy(String::length,TreeMap::new, Collectors.counting()));
        System.out.println(collect1);


        // 9. Partitioning Elements :-
        // Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length() > 5)));

        // 10. Mapping and Collecting
        // applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        // Eg. 1 : Collecting names by length
        List<String> l1 = Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // Eg. 2 : Counting word occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Eg. 3 : Partitioning even and odd numbers
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x%2 == 0)));

        // Eg. Summing values in a Map
        Map<String,Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Eg. 5 : Creating a Map from stream elements
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(),x -> x.length())));

        // Eg. 6 :
        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1,(x,y) -> x+y)));

    }
}
