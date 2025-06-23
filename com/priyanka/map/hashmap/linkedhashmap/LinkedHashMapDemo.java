package com.priyanka.map.hashmap.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        /*LinkedHashMap ek sub class h HashMap ki
        * LinkedHashMap me order maintain hota h jis order me ham elements ko dalte h
        * LinkedHashMap bhi thread safe nhi h
        * */
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(11,0.8f,true);  //double linked list hoti h linked hash map me
                                                                                                        // access order by default false hota h. true - access order, false - insertion order
        /*
        HashMap<String,Integer> hashMap = new HashMap<>();
        hashMap.put("orange",10);
        hashMap.put("apple",20);
        hashMap.put("guava",13);
        hashMap.put("grape",24);
        */

        linkedHashMap.put("orange",10);
        linkedHashMap.put("apple",20);
        linkedHashMap.put("guava",13);
        linkedHashMap.get("apple");  //ham use nhi ker rhe bas access ker rahe h, toh apple hamari L.L ke last me pauch jayega
        linkedHashMap.get("orange");

        /*
        Note : If there are some entries or data and we have to remove the least recently used data
                iss case me ham access order true kerke  or linkedhashmap use kerke least recently used data find out ker skte h
                (This is called cache eviction strategy)
        */

        for(Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("shubham",91);
        hashMap.put("bob",80);
        hashMap.put("akshit",79);

        Integer res = hashMap.getOrDefault("shubham",0); //getOrDefault ka mtlb ki agar hashMap me shubham key aati h toh vo return kerdo nhi aati h toh default value return kerdo
        System.out.println(res);

        Integer res1 = hashMap.getOrDefault("aman",0);
        System.out.println(res1);

        //hashMap.putIfAbsent("shubham",93);    // agar hashMap me ye value nhi h already tb daliye mtlb value replace ho jayenge jese ki marks change ho jaynge agar same nhi hue toh

        hashMap.put("shubham",100);
        System.out.println(hashMap);

        hashMap.putIfAbsent("priya",101);
        System.out.println(hashMap);

        Integer i = hashMap.get("priya");
        System.out.println(i);

    }
}


