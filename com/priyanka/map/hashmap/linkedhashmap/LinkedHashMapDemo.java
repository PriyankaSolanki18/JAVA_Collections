package com.priyanka.map.hashmap.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.8f,true);  //double linked list
                                                                                                        // access order by default false hota h. true - access order, false - insertion order
        /*
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("orange",10);
        hashMap.put("apple",20);
        hashMap.put("guava",13);
        */
        linkedHashMap.put("orange",10);
        linkedHashMap.put("apple",20);
        linkedHashMap.put("guava",13);
        linkedHashMap.get("apple");  //ham use nhi ker rhe bas access ker rahe h, toh apple hamari L.L ke last me pauch jayega
        linkedHashMap.get("orange");

        for(Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("shubham",91);
        hashMap.put("bob",80);
        hashMap.put("akshit",79);

        Integer res = hashMap.getOrDefault("shubham",0);
        System.out.println(res);

        Integer res1 = hashMap.getOrDefault("aman",0);
        System.out.println(res1);

//        hashMap.putIfAbsent("shubham",93);
        hashMap.put("shubham",100);
        System.out.println(hashMap);

        hashMap.putIfAbsent("priya",101);
        System.out.println(hashMap);

        Integer i = hashMap.get("priya");
        System.out.println(i);

    }
}


