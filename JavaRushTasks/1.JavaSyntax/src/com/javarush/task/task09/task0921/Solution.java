package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(System.in);


            while (true) {
                String s = scanner.nextLine();
                int set1 = Integer.parseInt(s);
                list.add(set1);
            }
        }
        catch (Exception e)
        {
            //System.out.println("Exception: " + e);
            for (Integer count : list) {
                System.out.println(count);
            }
        }
    }
}
