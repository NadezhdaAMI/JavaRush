package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int sum = 0;
        sum = (number - number % 100) / 100 +  (number % 100) % 10 + ((number % 100) - (number % 100) % 10) / 10 ;
        return sum;
    }
}