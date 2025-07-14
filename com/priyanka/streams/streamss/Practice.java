package com.priyanka.streams.streamss;

import java.util.*;
import java.io.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter str : ");
        str = sc.nextLine();
        System.out.println(str);
        System.out.println("Length of str = "+str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        if(str.equals("priyanka")){
            System.out.println("Matched !!!");
        }else{
            System.out.println("Doesn't match !!!");
        }
    }
}
