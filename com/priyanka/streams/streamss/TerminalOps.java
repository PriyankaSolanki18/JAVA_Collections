package com.priyanka.streams.streamss;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        // 1.collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x -> System.out.println(x));

        // 3. reduce : combines elements to produce a single result
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);



    }
}
