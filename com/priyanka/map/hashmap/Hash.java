package com.priyanka.map.hashmap;

public class Hash {
    public static void main(String[] args) {
        System.out.println(simpleHash("abc"));
        System.out.println(simpleHash("bca"));
    }
    public static int simpleHash(String key){
        int sum=0;
        for(char c : key.toCharArray()){
            sum += (int)c;
        }
        return sum%10;
    }
}
