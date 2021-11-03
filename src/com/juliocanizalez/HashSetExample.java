package com.juliocanizalez;

import java.util.HashSet;

public class HashSetExample {
  HashSet<String> hSet = new HashSet<>();

  void addValues() {
    hSet.add("Valor1");
    hSet.add("Valor2");
    hSet.add("Valor3");
    hSet.add("Valor4");
    hSet.add("Valor5");
    hSet.add("Valor5");//HashSet no permite duplicados
    System.out.println("Add");
    System.out.println(hSet);
  }

  void removeValue(int i) {
    String value = String.format("Valor%d", i);
    hSet.remove(value);
    System.out.println("Remove");
    System.out.println(hSet);
  }

  void updateValue(int olderValue, String newValue) {
    String value = String.format("Valor%d", olderValue);
    for (String element : hSet) {
      if (element.equals(value)) {
        hSet.remove(value);
        hSet.add(newValue);
        break;
      }
    }

    System.out.println("Update");
    System.out.println(hSet);
  }

}
