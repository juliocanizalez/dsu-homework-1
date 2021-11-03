package com.juliocanizalez;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

  LinkedHashSet<String> lhSet = new LinkedHashSet<>();

  void addValues() {
    lhSet.add("Valor1");
    lhSet.add("Valor2");
    lhSet.add("Valor3");
    lhSet.add("Valor4");
    lhSet.add("Valor5");
    //definiendo iterador para recorrer la lista
    Iterator<String> i = lhSet.iterator();
    System.out.println("LinkedHashSet Add");
    while (i.hasNext()) {
      System.out.println(i.next());
    }

    /* Sin necesidad de ocupar un iterador opcionalmente se puede
     * hacer con un for
     *
     * for (String s : lhSet){
     *  System.out.println(s);
     * }
     */
  }

  void updateValue(int olderValue, String newValue) {
    String value = String.format("Valor%d", olderValue);
    for (String element : lhSet) {
      if (element.equals(value)) {
        lhSet.remove(value);
        lhSet.add(newValue);
        break;
      }
    }

    System.out.println("LinkedHashSet Update");
    for (String s : lhSet) {
      System.out.println(s);
    }
  }

  void removeValue(int i){
    String value = String.format("Valor%d", i);
    lhSet.remove(value);
    System.out.println("LinkedHashSet Remove");
    for (String s : lhSet) {
      System.out.println(s);
    }
  }

}
