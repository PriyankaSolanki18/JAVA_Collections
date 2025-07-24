package com.priyanka.queues;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem{
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        // ConcurrentLinkedQueue --> An implementation of the Queue interface that supports lock-free, thread-safe operations

        Thread producer = new Thread(() -> {
            while (true){
                try{
                    taskQueue.add("Task "+System.currentTimeMillis()); //adds task (will use locks internally)
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        Thread consumer = new Thread(() -> {
            while (true){
                try{
                    String task = taskQueue.poll(); // takes task (will use locks internally)
                    System.out.println("Processing: "+task);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
