package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            else {
                list.add(s);
            }
        }
        for (String s : list) {
            try {
                if (s.contains(".")){
                    Double d = Double.parseDouble(s);
                    print(d);
                }
                else {
                    int i = Integer.parseInt(s);
                    if (i > 0 && i < 128){
                        short sh = (short)i;
                        print(sh);}
                    else {
                        if (i <= 0 || i >= 128) {
                            print(i);
                        }
                    }
                }
            }
            catch (Exception e){
                print(s);
            }
        }
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
