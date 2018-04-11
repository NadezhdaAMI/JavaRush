package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args)
    {
        try {
//            System.out.println("1");
            divisionByZero();
//            System.out.println("2");
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
    }
    public static void divisionByZero()
    {
        int a = 20;
        int b = a / 0;
        System.out.println(b);
    }
}
