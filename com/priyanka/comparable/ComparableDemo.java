package com.priyanka.comparable;

import java.util.*;
import java.io.*;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Charlie",3.5));
        list.add(new Student("Bob",3.7));
        list.add(new Student("Alice",3.5));
        list.add(new Student("Akshit",3.9));
        list.sort(null); // iss case me hame nhi pata kis tarah se ye sort karega
        System.out.println(list);


        /*List<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(3);
        num.add(1);
        num.add(78);
        num.sort(null);
        System.out.println(num);*/
    }
}

//NOTE : Comparator tab chlta h jab hame khud se apna logic likhna hota h jo ki natural ordering nhi hoti ya fir hame multiple fileds ke along sort kerna hota h, iske andar method hota h (compare)
// Comparable ke andar (compareTo) method hota h
