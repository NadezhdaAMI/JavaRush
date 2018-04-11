package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Fillipka";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Fil";
//        System.out.println(cat.name);
    }

    public static class Cat {
        public String name;
    }
}
