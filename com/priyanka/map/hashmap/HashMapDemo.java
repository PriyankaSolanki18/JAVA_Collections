package com.priyanka.map.hashmap;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Akshit");
        map.put(42,"Neha");
        map.put(31,"Priyanka");
        map.put(31,"Sreenivas");
        //map.put(null,"sree");  //map se sirf ek ni null key ho skti h
        //map.put(null,"yadav");  //isme hamne sree ko replace ker diya yadav se, mtlb sree ki entry gayab ho gyi
        System.out.println(map);

        String student = map.get(42); //pata chal jayeg aki roll no. 42 kiska h
        System.out.println(student);

        String s = map.get(53);
        System.out.println(s);  //o/p:null, coz present hi nhi h

        System.out.println(map.containsKey(31));

        System.out.println(map.containsValue("Akshit"));

        /*
        Set<Integer> keys = map.keySet();
        for(int i : keys){
            System.out.println(map.get(i));
        }
        */

        //upar jesa likha h uski jagah ham ese bhi likh sakte h:
        for(int i : map.keySet()){
            System.out.println(map.get(i));
        }

        //Ye ek list h entries ki mtlb ek list me multiple entries h key-value format me
        Set<Map.Entry<Integer,String>> entries = map.entrySet();

        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        for(Map.Entry<Integer,String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(1);
        System.out.println(map);

        boolean res = map.remove(31,"Nitin");
        System.out.println("Removed ? : "+res);
        System.out.println(map);

        /*
        List<Integer> list = Arrays.asList(2,4,32,43,4,432);
        System.out.println(list.contains(32));
        */



    }
}
