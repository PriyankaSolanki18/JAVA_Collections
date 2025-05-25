package com.priyanka.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);   // yaha hame new keyword use kiya h toh iska hash code different aayega
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);   // yaha hame new keyword use kiya h toh iska hash code different aayega yaani ki map me 3 entries rakhi jayegi
        map.put(p1,"engineer");  //hashcode1 --> index1
        map.put(p2,"designer");  //hashcode2 --> index2
        map.put(p3,"manager");  //hashcode3 --> index3   // is case me hashcode different islye h kyuki hamne new keyword use kiya tha
                                // but @Override equals() method ki vajah se ab hashcode1 --> index1 --> equals --> replace


        System.out.println("HashMap size : "+map.size());
        System.out.println("Value of p1 : "+map.get(p1));
        System.out.println("Value of p3 : "+map.get(p3));
        System.out.println(p1);


        Map<String,Integer> map1 = new HashMap<>();
        map1.put("Shubham",90); //hashcode1 --> index1
        map1.put("neha",92);  //hashcode2 --> index2
        map1.put("Shubham",99);  //hashcode1 --> index1 --> equals() --> replace
    }
}

class Person{
    private String name;
    private int id;
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,id);
    }

    @Override
    public String toString() {
        return "id : "+id+", name : "+name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        // Important logic to compare
        Person other = (Person) obj;
        return id == other.getId() && Objects.equals(name,other.getName());
    }
}

//NOTE : jab bhi ham custom class banate h then make sure ki ham uska hashCode method and equals method likh de