package com.priyanka.hashtable;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashTable = new Hashtable<>();
        //Hashtable is synchronized and thread safe, it implements Map -> isme ek thread modify ker skta h map ko ek time per multiple thread ek saath modify nhi ker skte jesa ki HashMap me ho skta h
        //No null key or value as it in Map
        //Legacy Class -> not in use as it has been replaced by ConcurrentHashMap
        //Performance -> slower than HashMap, because it is synchronized toh uska overhead aata h
        //only linkedlist in case of collision
        //all methods are synchronized, Eg. get() i.e; read operation : ek thread ek bari me read ker skta h Hashtable ko, ye iski limitation h isi vajah se ConcurrentHashMap aaya

        /*hashTable.put(1,"apple");
        hashTable.put(2,"banana");
        hashTable.put(3,"cherry");
        System.out.println(hashTable);
        System.out.println("Value for key 2 : "+hashTable.get(2));
        System.out.println("Does key 3 exist ? : "+ hashTable.containsKey(3));
        hashTable.remove(1);
        System.out.println(hashTable);
        System.out.println("After removing key 1 : "+hashTable.containsKey(1));*/
        //hashTable.put(null,"value");  // throws exception
        //hashTable.put(4,null);  //throws exception

        //HashMap<Integer,String> map = new HashMap<>();
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        Thread thread1 = new Thread(() -> {
           for(int i=0;i<1000;i++){
               hashtable.put(i,"Thread1");
           }
        });
        Thread thread2 = new Thread(() -> {
           for(int i=1000;i<2000;i++){
               hashtable.put(i,"Thread2");
           }
        });
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final size of HashMap : "+hashtable.size());
    }
}
