package com.juliocanizalez;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
  Hashtable<Integer, String> hashtable = new Hashtable<>();

  void addValues(){
    hashtable.put(1, "Valor1");
    hashtable.put(2, "Valor2");
    hashtable.put(3, "Valor3");
    hashtable.put(4, "Valor4");
    hashtable.put(5, "Valor5");

    System.out.println("\nHashTable Add");
    for(Map.Entry element : hashtable.entrySet()){
      System.out.println(element.getKey() + ": " + element.getValue());
    }
  }

  void removeValue(int key){
    hashtable.remove(key);
    System.out.println("\nHashTable Remove");
    for(Map.Entry element : hashtable.entrySet()){
      System.out.println(element.getKey() + ": " + element.getValue());
    }
  }

  void updateValue(int key, String newValue){
    hashtable.computeIfPresent(key, (k, v) -> newValue);
    System.out.println("\nHashTable Update");
    for(Map.Entry element : hashtable.entrySet()){
      System.out.println(element.getKey() + ": " + element.getValue());
    }
  }
}
