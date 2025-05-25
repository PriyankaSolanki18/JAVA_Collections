package com.priyanka.map.hashmap.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity,0.75f,true);
        this.capacity=capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache<String,Integer> studentMap = new LRUCache<>(3);
        studentMap.put("bob",99);
        studentMap.put("alice",99);
        studentMap.put("ram",92);
        //studentMap.get("bob");  // is case me alice remove ho jayega
        studentMap.put("bob",134);  // is case me bhi alice remove ho jayega
        studentMap.put("vipul",93);

        //studentMap.get("bob");
        // get() method use kerne per bhi kuch nhi hoga kyuki bob tab hi remove ho chuka tha jab hamne put() chalaya tha
        System.out.println(studentMap);
    }
}
