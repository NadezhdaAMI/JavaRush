package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map2 = new HashMap<String, Cat>();
        map2.put("Name1", new Cat("Barsik"));
        map2.put("Name2", new Cat("Mursik"));
        map2.put("Name3", new Cat("Barsik01"));
        map2.put("Name4", new Cat("Barsik02"));
        map2.put("Name5", new Cat("Barsik03"));
        map2.put("Name6", new Cat("Barsik04"));
        map2.put("Name7", new Cat("Barsik05"));
        map2.put("Name8", new Cat("Barsik06"));
        map2.put("Name9", new Cat("Barsik07"));
        map2.put("Name10", new Cat("Barsik08"));
        return map2;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Map<String, Cat> map1 = new HashMap<String, Cat>();
        Set<Cat> set1 = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()){
            Cat value = pair.getValue();
            set1.add(value);
        }
        return set1;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
