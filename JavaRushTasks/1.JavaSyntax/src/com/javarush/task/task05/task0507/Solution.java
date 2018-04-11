package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        double d;
        double sum = 0;
        double sumAverage;
        int n = 0;
        while (true){
            d = (double) scanner.nextInt();
            if (d == (-1)){
              break;
            } else {
                  sum = sum + d;
                n++;
            }
        }
        sumAverage = sum / n;
        System.out.println(sumAverage);
    }
}

