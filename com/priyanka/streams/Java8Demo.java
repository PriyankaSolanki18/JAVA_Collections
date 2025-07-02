package com.priyanka.streams;

import java.util.Map;

public class Java8Demo {
    public static void main(String[] args) {
        //Streams

        //Java 8 --> minimal code, functional programming
        //       --> lambda expression, Streams, Date & Time API


        //Lambda Expression : is an anonymous function (no name, no return type, no access modifier)
        //                    kha use hota h : to implement functional interface

        Thread t1 = new Thread(()-> {
            System.out.println("Hello");
        });

        //jab ek hi line ho toh return ko skip ker sakte h or curly braces bhi hatane padenge
        //isme ham MathOperation interface ki paribhasha likh rahe h jisme sirf ek hi method h toh compiler khud hi smjh jayega ki dono parameter int hi honge hame explicitly nhi batana padega
        //MathOperation sumOperation = (int a, int b) -> a+b;
        //return a+b;

        //ham interface ka reference use ker rahe h lambda expresssion hold kerne ke liye
        MathOperation sumOperation = (a, b) -> a+b;
        int res1 = sumOperation.operation(1,2);
        System.out.println("Sum : "+res1);

        MathOperation subOperation = (a,b) -> a-b;
        int res2 = subOperation.operation(4, 2);
        System.out.println("Sub : "+res2);

        MathOperation mulOperation = (a,b) -> a*b;
        int res3 = mulOperation.operation(6,2);
        System.out.println("Mul : "+res3);

        MathOperation divOperation = (a,b) -> a/b;
        int res4 = divOperation.operation(12,2);
        System.out.println("Div : "+res4);

    }
}

//what is the purpose of class Task : ki ham bata sake hi jo Runnable interface h usme ek method h run() uski implementation likhni h that's it, iss class ka ye kaam h.
class Task implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

@FunctionalInterface
interface MathOperation{
    int operation(int a, int b);
}

/*class SumOperation implements MathOperation{

    @Override
    public int operation(int a, int b) {
        return a+b;
    }
}*/
