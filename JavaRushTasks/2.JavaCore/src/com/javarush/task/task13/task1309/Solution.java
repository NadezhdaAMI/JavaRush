package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Movable{
        Double speed();
    }

    interface Flyable extends Movable {
//        double a = 1;
        Double speed(Flyable a);
    }
}