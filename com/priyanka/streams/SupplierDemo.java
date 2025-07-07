package com.priyanka.streams;

import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        //leta kuch nhi h sirf deta h

        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

    }
}
