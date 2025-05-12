package com.priyanka.comparator;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

class Student{
    private String name;
    private  double gpa;

    //constructor
    public Student(String name, double gpa){
        this.name=name;
        this.gpa=gpa;
    }

    //getters
    public String getName() {return name;}
    public double getGpa() {return gpa;}
}

class StringLengthComparator implements Comparator<String>{

    @Override
    //compare method sirf 2 cheezo ko compare kerta h
    public int compare(String o1, String o2) {
        //ascending order
        //return o1.length() - o2.length();

        //descending order
        return o2.length() - o1.length();
    }
}
// ascending order me aayega
//   o1 ,  o2
// "ok", "bye"

class MyComparator implements Comparator<Integer>{

    @Override
    /*
    compare method determine the order of the object o1 and o2, the int it is returning will tell us the relative order of o1 and o2
    (-ve) vlaue return ker rha h mtlb o1 phele aayega o2 se
    (0) mtl o1 == o2
    (+ve) value mtlb o2 phele aayega o1 se
    */
    public int compare(Integer o1, Integer o2) {
        //for ascending order
        //return o1 - o2;

        //For descending order
        return o2 - o1;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        //by default ascending order me sort kerta h sort method - 1,2,3
        list.sort(null);
        System.out.println("Sorting using sort : "+list);

        list.sort(new MyComparator());
        //list.sort((a,b) -> b - a);
        System.out.println("Sorting in desc order : using instance of MyComparator class : "+list);

        List<String> words = Arrays.asList("banana","apple","date");
        //words will be sort according to their length
        words.sort(new StringLengthComparator());
        System.out.println("Sorting words according to their length using class instance : "+words);

        List<String> names = Arrays.asList("priyanka","agrata","malvika");
        //descending order
        names.sort((a,b) -> b.length() - a.length());

        //ascending order
        //names.sort((a,b) -> a.length() - b.length());

        System.out.println(names);


        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie",3.5));
        students.add(new Student("Alice", 3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("Priyanka",4.5));
        //sorting in descending order of gpa
        /*students.sort((o1,o2) -> {
            if(o2.getGpa() - o1.getGpa() > 0){
                return 1;
            } else if (o2.getGpa() - o1.getGpa() < 0){
                return -1;
            }else{
                //Alice  //Charlie
                return o1.getName().compareTo(o2.getName());
            }
        });
         */

        //Java 8 Concept -
                                                                              //to get in reverse order we used .reverse() method
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
                                                                                          //.thenComparing() method is used if we further want to sort by the name as well
        students.sort(comparator);

        for(Student s:students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }
    }
}
