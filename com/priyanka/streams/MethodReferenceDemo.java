package com.priyanka.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        //method reference --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("ram","shyam","ghanshyam");
        //students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);  //method reference

        //constructor reference
        List<String> names = Arrays.asList("A","B","c");
        //List<MobilePhone> mobilePhoneList = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList());
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList());
    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }

}
