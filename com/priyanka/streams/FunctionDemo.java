package com.priyanka.streams;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //Function --> work for you
        Function<Integer,Integer> doubleIt = x -> 2*x;
        Function<Integer,Integer> tripleIt = x -> 3*x;
        System.out.println(tripleIt.apply(30));
        System.out.println(doubleIt.apply(100));
        System.out.println(doubleIt.andThen(tripleIt).apply(20));  //same ans isme phele double hoga fir triple : 20*2=40 -> 40*3=120
        System.out.println(doubleIt.compose(tripleIt).apply(20));  //same ans isme phele triple hoga fir double : 20*3=60 -> 60*2=120

    }
}
