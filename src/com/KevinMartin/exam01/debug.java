package com.KevinMartin.exam01;

import java.util.HashMap;
import java.util.Map;

public class debug {

    static Map<String, Integer> assignTemps(String[] cities, Integer[] temps) {
        Map<String, Integer> temperatures = new HashMap<>();

        for (int i = 0; i < cities.length; i++) {
            temperatures.put(cities[i], temps[i]);
        }
        return temperatures;
    }

    static void displayFreezing(Map<String, Integer> tempsMap){
        for (String city: tempsMap.keySet()) {
            if (tempsMap.get(city) <= 32) {
                System.out.println("It's cold in " + city + "!");
            }
        }
    }

    public static void main(String[] args) {
        String[] cities = {"Cleveland", "New York", "Dallas", "Tampa"};
        Integer[] temps = {15, 30, 45, 70};
        Map<String , Integer > tempMap = new HashMap<>();
        tempMap = assignTemps(cities, temps);
        displayFreezing(tempMap);
    }
}
