package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
       // int k = 10;
        while (true){
            if (n == 0 )
                break;
            if (n % 2 == 0) {
               even++;

           } else odd++;
           n /= 10;
        }
        System.out.println("Even: "+ even + " Odd: " + odd);
    }
}
