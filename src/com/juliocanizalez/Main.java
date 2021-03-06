package com.juliocanizalez;

public class Main {

  public static void main(String[] args) {
    HashSetExample hSet = new HashSetExample();
    LinkedHashSetExample lhSet = new LinkedHashSetExample();
    TreeSetExample tSet = new TreeSetExample();
    ArrayListExample arrList = new ArrayListExample();
    VectorExample vector = new VectorExample();
    LinkedListExample linkedList = new LinkedListExample();
    PriorityQueueExample pQueue = new PriorityQueueExample();
    HashTableExample hashTable = new HashTableExample();
    HashMapExample hashMap = new HashMapExample();
    LinkedHashMapExample lHashMap = new LinkedHashMapExample();
    TreeMapExample treeMap = new TreeMapExample();

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

    // ArrayList Example
    arrList.addValues();
    arrList.updateValue(2, "ArrayList");
    arrList.removeValue(2);

    // Vector Example
    vector.addValues();
    vector.updateValue(2, "Vector");
    vector.removeValue(2);

    // LinkedList Example
    linkedList.addValues();
    linkedList.removeValue(0);
    linkedList.updateValue("Valor1", "LinkedList");

    // Priority Queue Example
    pQueue.addValues();
    pQueue.removeValue(15);
    pQueue.updateValue(5, 24);

    //HashTable Example
    hashTable.addValues();
    hashTable.removeValue(1);
    hashTable.updateValue(2, "HashTable");

    // HashMap Example
    hashMap.addValues();
    hashMap.updateValue("El Salvador", "Sonsonate");
    hashMap.removeValue("El Salvador");

    // LinkedHashMap Example
    lHashMap.addValues();
    lHashMap.updateValue(2, "LinkedHashMap");
    lHashMap.removeValue(2);

    // TreeMap Example
    treeMap.addValues();
    treeMap.updateValue(1, "TreeMap");
    treeMap.removeValue(1);
  }
}