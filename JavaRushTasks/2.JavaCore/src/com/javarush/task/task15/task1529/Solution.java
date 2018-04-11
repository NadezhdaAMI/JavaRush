package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();

    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            if (s.equals("helicopter")) {
                result = new Helicopter();
                System.out.println(result);
            }
            if (s.equals("plane")){
                System.out.println("Введите количество пассажиров:");
                String s_n = reader.readLine();
                int n = Integer.parseInt(s_n);
                result = new Plane(n);
                System.out.println(result);

            }
            reader.close();

        }
        catch (Exception e){
            System.out.println("Ошибка ввода!!!");
        }

    }
}
