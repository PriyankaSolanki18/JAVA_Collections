package com.priyanka.copyonwritearraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        //"Copy on Write" means that whenever a write operation
        //like adding or removing an element
        //instead of directly modifying the existing list
        //a new copy of the list is created and the modification is applied to that
        //this ensures that other threads reading the list while it's being modified are unaffected

        //Read operations: Fast and direct since they happen on a stable list without interference from modifications
        //Write operations: a new copy of the list is created for every modification
        //                  the reference to the list is then updated so that subsequent reads use this new list

        // Eg.-> notepad --> (notepad-copy) ham iski ek copy banva lenge or fir usme change ker lenge

        //CopyOnWriteArrayList ham tab prefer kerte h jab read operation zayada ho na ki write

        //List<String> shoppingList = new ArrayList<>();
        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("milk");
        shoppingList.add("eggs");
        shoppingList.add("bread");
        System.out.println("initial shopping list : "+shoppingList);


        //NOTE: Yaha ArrayList stable nhi h but vo honi chahiye, coz ham yaha reading ke saath hi write operation bhi ker rahe h jiski vajah se "ConcurrentModificationException" aa jayega

        for(String item : shoppingList){
            //System.out.print(item+" ");
            //try to modify the list while reading
            if(item.equals("eggs")){
                shoppingList.add("butter");
                System.out.println("added butter while reading");
            }
        }
        //System.out.println();
        //purani list = new list , after modification
        System.out.println("updated shopping list : "+shoppingList);

//        List<String> sharedList = new ArrayList<>();
        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");
        Thread readerThread = new Thread(() -> {
           try{
               while(true){
                   //iterate through the list
                   for(String item : sharedList){
                       System.out.println("Reading item : "+item);
                       Thread.sleep(100); //small delay to simulate work
                   }
               }
           }catch (Exception e){
               System.out.println("Exception in reader thread : "+e);
           }
        });

        Thread writerThread = new Thread(() -> {
           try{
               Thread.sleep(500); //delay to allow reading to start first
               sharedList.add("item4");
               System.out.println("added item4 to the list");

               Thread.sleep(500);
               sharedList.remove("item1");
               System.out.println("removed item1 from the list");
           }catch(InterruptedException e){
               e.printStackTrace();
           }
        });

        readerThread.start();
        writerThread.start();

    }
}
