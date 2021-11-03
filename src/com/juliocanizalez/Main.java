package com.juliocanizalez;

public class Main {

  public static void main(String[] args) {
    HashSetExample hSet = new HashSetExample();

    hSet.addValues();
    hSet.removeValue(2);
    hSet.updateValue(1, "HashSetExample");
  }
}