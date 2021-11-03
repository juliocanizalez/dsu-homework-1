package com.juliocanizalez;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
  TreeSet<String> tSet = new TreeSet<>();

  void addValues() {
    // TreeSet adds in ascending order
    tSet.add("Valor5");
    tSet.add("Valor3");
    tSet.add("Valor1");
    tSet.add("Valor2");
    tSet.add("Valor4");

    System.out.println("\nTreeSet Add Ascending (Default)");
    for (String s : tSet) {
      System.out.println(s);
    }

    System.out.println("\nDescending (with iterator)");
    Iterator<String> i = tSet.descendingIterator();
    while(i.hasNext()){
      System.out.println(i.next());
    }
  }

  // is this the best approach?
  void updateValue(int olderValue, String newValue){
    String value = String.format("Valor%d", olderValue);
    for (String element : tSet) {
      if (element.equals(value)) {
        tSet.remove(value);
        tSet.add(newValue);
        break;
      }
    }

    System.out.println("\nTreeSet Update (?)");
    for (String s : tSet) {
      System.out.println(s);
    }
  }

  void removeValue(int value){
    String fValue = String.format("Valor%d", value);
    tSet.remove(fValue);
    System.out.println("\nTreeSet Remove");
    for (String s : tSet) {
      System.out.println(s);
    }
  }
}
