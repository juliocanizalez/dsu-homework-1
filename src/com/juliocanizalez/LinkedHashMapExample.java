package com.juliocanizalez;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
  LinkedHashMap<Integer, String> lHashMap = new LinkedHashMap<>();

  void addValues() {
    lHashMap.put(1, "Valor1");
    lHashMap.put(2, "Valor2");
    lHashMap.put(3, "Valor3");
    lHashMap.put(4, "Valor4");
    lHashMap.put(5, "Valor5");

    System.out.println("\nLinkedHashMap Add");
    //shorthand to print keys and values
    System.out.println(lHashMap.entrySet());
  }

  void updateValue(int key, String newValue) {
    lHashMap.computeIfPresent(key, (k, v) -> newValue);
    System.out.println("\nLinkedHashMap Update");
    System.out.println(lHashMap.entrySet());
  }

  void removeValue(int key){
    lHashMap.remove(key);
    System.out.println("\nLinkedHashMap Remove");
    System.out.println(lHashMap.entrySet());
  }
}
