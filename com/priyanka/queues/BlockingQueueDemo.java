package com.priyanka.queues;

import java.util.Comparator;
import java.util.concurrent.*;

class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private  int value=0;
    public Producer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while(true){
         try{
             System.out.println("Producer produced: "+value);
             queue.put((value++));
             Thread.sleep(1000);
         }catch (Exception e){
             Thread.currentThread().interrupt();
             System.out.println("Producer interrupted");
         }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
    public Consumer(BlockingQueue<Integer> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                Integer value = queue.take();
                System.out.println("Consumer consumed: "+value);
                Thread.sleep(2000);
            }catch (Exception e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer interrupted");
            }
        }
    }
}

public class BlockingQueueDemo {
    public static void main(String[] args) {
        // 1.
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        // ArrayBlockingQueue kya h ?? --> A bounded, blocking queue backed by a circular array
        // BlockingQueue ek interface h or iska ek implementation h ArrayBlockingQueue
        // low memory overhead
        // single lock --> producer and consumer block each other, i.e; uses a single thread for both enqueue and dequeue operations
        // more threads --> problem coz ek dusre ka waiting time bad jayega

        Thread producer = new Thread(new Producer(queue));
        Thread consumer = new Thread(new Consumer(queue));
        producer.start();
        consumer.start();

        // BlockingQueue ka ek or implementation h:-
        // 2.
        BlockingQueue<Integer> queue1 = new LinkedBlockingQueue<>();
        // optionally bounded h ye, unbounded me risk h out of bound error aa skti h, isliye bounded hi rakhe
        // backed by LinkedList
        // uses two separate locks for enqueue and dequeue operations
        // higher concurrency between producers and consumers


        // 3.
        BlockingQueue<String> queue2 = new PriorityBlockingQueue<>(11, Comparator.reverseOrder());
        // Binary Heap as array is used internally and can grow dynamically
        // Head is based on their natural ordering or a provided Comparator like priority queue
        // unbounded h, put won't block
        queue2.add("apple");
        queue2.add("banana");
        queue2.add("cherry");
        System.out.println(queue2);


        // 4.
        BlockingQueue<Integer> queue3 = new SynchronousQueue<>();
        // each insert operation must wait for a corresponding remove operation by another thread and vice versa
        // it can't store elements, capacity of at most one element





        // thread safe queue
        // wait for queue to become non-empty / wait for space
        // simplify concurrency problems like producer-consumer
        // standard queue --> immediately chal jate h operations
                       // --> empty --> remove, wait nhi karega or operation chal jayega
                       // --> full --> add, (no waiting)

        //Blocking queue
          // put --> Blocks if the queue is full until space becomes available
          // take --> Blocks if the queue is empty until an element becomes available
          // offer --> Waits for space to become available, up to the specified timeout

    }
}
