package com.juliocanizalez;

import java.util.Vector;

public class VectorExample {

  Vector<String> vector = new Vector<>();

  void addValues(){
    vector.add("Valor1");
    vector.add("Valor2");
    vector.add("Valor3");
    vector.add("Valor4");
    vector.add("Valor5");

    System.out.println("\nVector Add");
    System.out.println(vector);
  }

  void updateValue(int oldValue, String newValue){
    String fValue = String.format("Valor%d", oldValue);
    if(vector.contains(fValue)){
      vector.set(oldValue, newValue);
    }

    System.out.println("\nVector Update");
    System.out.println(vector);
  }

  void removeValue(int i){
    vector.remove(i);
    System.out.println("\nVector Remove");
    System.out.println(vector);
  }
}
