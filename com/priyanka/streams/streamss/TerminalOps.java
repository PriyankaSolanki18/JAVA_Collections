package com.priyanka.streams.streamss;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        // 1.collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce : combines elements to produce a single result
        //Optional<Integer> optionalInteger = list.stream().reduce((x, y) -> x + y);
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger);

        // 4. count

        // 5. anyMatch, allMatch, noneMatch

        boolean b = list.stream().anyMatch(x -> x%2 == 0);
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> x<0);
        System.out.println(b2);

        // 6. findFirst, findAny

        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());

        // Example : Filtering ans Collecting Names
        List<String> names = Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(names.stream().filter(x -> x.length() > 3).toList());

        // Example : Squaring and Sorting Numbers
        List<Integer> numbers = Arrays.asList(5,2,9,1,6);
        System.out.println(numbers.stream().map(x -> x*x).sorted().toList());

        // Example : Summing Values
        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        System.out.println(integers.stream().reduce(Integer::sum));

        // Example : Counting occurrences of a Character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x=='l').count());

        // Example :
        // stream cannot be reused after a terminal operation has been called
        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
        List<String> list1 = stream.map(String::toUpperCase).toList(); // exception aayega

        // stateful & stateless operations

    }
}
