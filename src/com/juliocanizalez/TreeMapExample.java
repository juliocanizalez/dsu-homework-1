package com.juliocanizalez;

import java.util.TreeMap;

public class TreeMapExample {
  TreeMap<Integer, String> treeMap = new TreeMap<>();

  void addValues() {
    treeMap.put(1, "Valor1");
    treeMap.put(2, "Valor2");
    treeMap.put(3, "Valor3");
    treeMap.put(4, "Valor4");
    treeMap.put(5, "Valor5");

    System.out.println("\nLinkedHashMap Add");
    //shorthand to print keys and values
    System.out.println(treeMap.entrySet());
  }

  void updateValue(int key, String newValue) {
    treeMap.computeIfPresent(key, (k, v) -> newValue);
    System.out.println("\nLinkedHashMap Update");
    System.out.println(treeMap.entrySet());
  }

  void removeValue(int key){
    treeMap.remove(key);
    System.out.println("\nLinkedHashMap Remove");
    System.out.println(treeMap.entrySet());
  }
}
