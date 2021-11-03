package com.juliocanizalez;

public class Main {

  public static void main(String[] args) {
    HashSetExample hSet = new HashSetExample();
    LinkedHashSetExample lhSet = new LinkedHashSetExample();
    TreeSetExample tSet = new TreeSetExample();

    // HashSet Example
    hSet.addValues();
    hSet.removeValue(2);
    hSet.updateValue(1, "HashSetExample");

    // LinkedHashSet Example
    lhSet.addValues();
    lhSet.updateValue(1, "LinkedHashSet");
    lhSet.removeValue(2);

    // TreeSet Example
    tSet.addValues();
    tSet.removeValue(2);
    tSet.updateValue(1, "TreeSetExample");
  }
}