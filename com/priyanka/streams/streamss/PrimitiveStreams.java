package com.priyanka.streams.streamss;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {
    public static void main(String[] args) {

//        Integer[] numbers = {1,2,3,4,5};
//        Stream<Integer> stream = Arrays.stream(numbers);

        int[] numbers = {1,2,3,4,5};
        IntStream stream = Arrays.stream(numbers);

        // 1 is inclusive in the range and 5 in exclusive
//        IntStream range = IntStream.range(1,5);
        System.out.println(IntStream.range(1,5).boxed().collect(Collectors.toList()));

        //both 1 & 5 will be inclusive
        System.out.println(IntStream.rangeClosed(1,5).boxed().collect(Collectors.toList()));

        IntStream.of(1,2,3);

        //Random() is a class
        DoubleStream doubles = new Random().doubles(5);
        System.out.println(doubles.sum());
        System.out.println(doubles.max());
        System.out.println(doubles.min());
        System.out.println(doubles.average());
        System.out.println(doubles.summaryStatistics());

        //doubles.mapToInt(x -> (int)x+1);
        //System.out.println(doubles.boxed().toList());  // isko hamne comment isliye kiya h kyuki previous statement me stream khatam ho gyi h toh agar ye line comment nhi hogi toh isme exception aa jayega

        IntStream intss = new Random().ints(5);
        System.out.println(intss.boxed().toList());



    }
}
