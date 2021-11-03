package com.juliocanizalez;

import java.util.PriorityQueue;

public class PriorityQueueExample {
  PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

  void addValues(){

    pQueue.add(10);
    pQueue.add(20);
    pQueue.add(15);
    pQueue.add(40);
    pQueue.add(5);

    System.out.println("\nPriority Queue Add");
    System.out.println(pQueue);

    System.out.println("\nTop Element Priority Queue: " + pQueue.peek());

  }

  void updateValue(int oldValue, int newValue){
    // To update we need to remove and reinsert
    pQueue.remove(oldValue);
    pQueue.add(newValue);

    System.out.println("\nPriority Queue Update");
    System.out.println(pQueue);
  }

  void removeValue(int value){
    pQueue.remove(value);
    System.out.println("\nPriority Queue Remove");
    System.out.println(pQueue);
  }
}
