package com.priyanka.streams;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        // Predicate --> Functional interface (Boolean valued function)
        //agar kuch check kerna ho toh Predicate use kerna
        //ye sirf ek condition hold kerta h that's it, mtlb ham ek condition ko variable me store ker rahe h
        Predicate<Integer> isEven = x -> x%2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(isWordStartingWithA.test("Arjun"));

        //predicate ko combine bhi ker sakte h
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");
        System.out.println(isWordEndingWithT.test("Ankit"));

        Predicate<String> startEnd = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(startEnd.test("Arpit"));
    }
}
