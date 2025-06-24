package com.priyanka.map.hashmap.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1=new String("key"); // hamne yaha new likha h isliye iska(key1) hascode different hoga (key2) se
        String key2=new String("key");  // hashcode different hoga har object ka (key1 or key2 dono ka alg hoga)
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        System.out.println(key1.hashCode()); //ye content ke saath khelta h na ki address ke saath
        System.out.println(key2.hashCode());
        Map<String,Integer> map = new IdentityHashMap<>();

        // Jesa ki hame pata h ki do cheeze hoti h : hashcode and equals method
        // lekin IdentityHashMap ke case me IdentityHashcode and == operator(is case me bhi content nhi address compare kiye jayenge) use hote h
        // IdentityHashMap ki prakriya kuch esi h ki -> chahe aapki class me hash code ho ya na ho, IdentityHashMap me toh object ka hashcode hi chalega

        map.put(key1,1);  //key, 1
        map.put(key2,2);  //key, 2
        System.out.println(key1.equals(key2)); //dono equal h isliye iss case me replace ho jayega key ki value or map me sirf ek hi entry hogi jo bhi last me dalenge
        //hashcode and equals method
        System.out.println(map);
    }

    // NOTE : HashMap ka mtlb h hashcode hoga class ke andar agar class ke andar nhi h toh object ka use hoga
}
