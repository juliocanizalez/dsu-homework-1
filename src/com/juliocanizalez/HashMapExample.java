package com.juliocanizalez;

import java.util.HashMap;

public class HashMapExample {
  HashMap<String, String> capitalCities = new HashMap<String, String>();

  void addValues() {
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    capitalCities.put("El Salvador", "San Salvador");

    System.out.println("\nHashMap Add");
    System.out.println(capitalCities);

    System.out.println("\nCountries:");
    for (String country : capitalCities.keySet()) {
      System.out.println(country);
    }
  }

  void updateValue(String key, String newValue) {
    capitalCities.computeIfPresent(key, (k, v) -> newValue);
    System.out.println("\nHashMap Update");
    System.out.println(capitalCities);
  }

  void removeValue(String key){
    capitalCities.remove(key);
    System.out.println("\nHashMap Remove");
    System.out.println(capitalCities);
  }
}
