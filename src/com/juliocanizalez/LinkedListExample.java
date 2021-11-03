package com.juliocanizalez;

import java.util.LinkedList;

public class LinkedListExample {
  LinkedList<String> linkedList = new LinkedList<>();

  void addValues(){
    linkedList.add("Valor1");
    linkedList.add("Valor2");
    linkedList.add("Valor3");
    linkedList.add("Valor4");
    linkedList.add("Valor5");
    linkedList.addFirst("ValorInicio");
    linkedList.addLast("ValorFinal");

    System.out.println("\nLinkedList Add");
    System.out.println(linkedList);
  }

  void removeValue(int i){
    linkedList.remove(i);
    System.out.println("\nLinkedList Remove");
    System.out.println(linkedList);
  }

  void updateValue(String oldValue, String newValue){
    int index = linkedList.indexOf(oldValue);
    linkedList.set(index, newValue);
    System.out.println("\nLinkedList Update");
    System.out.println(linkedList);
  }
}
