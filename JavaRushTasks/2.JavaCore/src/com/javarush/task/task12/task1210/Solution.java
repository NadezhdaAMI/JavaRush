package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {
        System.out.print(max(4,1));
    }

    //Напишите тут ваши методы
    public static int max(int a, int b){
        if (a > b)
            return a;
        else return b;
    }

    public static long max(long a, long b){
        return (a > b) ? a : b;
        //if (a > b)
        //    return a;
        //else return b;
    }

    public static double max(double a, double b){
        if (a > b)
            return a;
        else return b;
    }
}
