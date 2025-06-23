package com.priyanka.map.hashmap.weakhashmap;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
       // Phone phone = new Phone("Apple","16 pro max");  // Strong reference : jab ham Phone phone = new Phone(); likhte h, mtlb ham directly iss reference(phone) se object ko access ker skte h
//        System.out.println(phone);
//        phone=null;
//        System.out.println(phone);

        WeakReference<Phone> phoneWeakReference =  new WeakReference<>(new Phone("Apple","16 pro max"));
        System.out.println(phoneWeakReference.get());
        System.gc();
        try{
            Thread.sleep(10000);
        }catch (Exception ignored){

        }
        System.out.println(phoneWeakReference.get());
    }
}
class Phone{
    String brand;
    String model;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

