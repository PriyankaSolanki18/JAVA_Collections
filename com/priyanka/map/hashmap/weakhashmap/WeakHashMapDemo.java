package com.priyanka.map.hashmap.weakhashmap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
//        String key1 = new String("img1");
//        String key2 = new String("img2");
                       //
//        imageCache.put(new String("img1"),new Image("Image 1"));  //yaha per ham objects bana ker unko use ker rahe h na ki directly string literal use ker rahe h
//        imageCache.put(new String("img2"),new Image("Image 2"));
        //imageCache.put("img1",new Image("Image 1"));  // yaha jo keys so vo String Literals h jo ki String pool me stored hongi jiski vajh se ye strong referenced ho jayenge, mtlb agar koi use ker bhi nhi rha h tab bhi java isko rakhega memory me jab tk program khatam nhi ho jata taki agar koi naya literal banta h toh vo same memory me se utha ker isse fir se reuse ker lega, so we need to make sure that we make non literals keys so that they don't get stored in string pool and don't have strong refernced or jo keys h vo garbage collect ho jaye
        //imageCache.put("img2",new Image("Image 2"));
        loadCache(imageCache);
        System.out.println(imageCache);
//        key1=null;
//        key2=null;
        System.gc();
        simulateApplicationRunning();
        System.out.println("Cache after running (some entries may be cleared) : "+imageCache);
    }

    public static void loadCache(WeakHashMap<String,Image> imageCache){
        String k1=new String("img1");
        String k2=new String("img2");
        imageCache.put(k1,new Image("Image 1"));  //yaha per ham objects bana ker unko use ker rahe h na ki directly string literal use ker rahe h
        imageCache.put(k2,new Image("Image 2"));

    }

    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulating application running.....");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

}

class Image{
    private String name;
    public  Image(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }
}
