package com.juliocanizalez;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
  List<String> arrList = new ArrayList<>();

  void addValues(){
    arrList.add("Valor1");
    arrList.add("Valor2");
    arrList.add("Valor3");
    arrList.add("Valor4");
    arrList.add("Valor5");

    System.out.println("\nArrayList Add");
    System.out.println(arrList.toString());
  }

  void updateValue(int olderValue, String newValue){
    String fValue= String.format("Valor%d", olderValue);
    if (arrList.contains(fValue)){
      arrList.add(olderValue, newValue);
    }

    System.out.println("\nArrayList Update");
    System.out.println(arrList.toString());
  }

  void removeValue(int i){
    arrList.remove(i);
    System.out.println("\nArrayList Remove");
    System.out.println(arrList.toString());
  }
}
