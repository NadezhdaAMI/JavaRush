package com.javarush.task.task14.task1419;

//import com.javarush.task.task15.task1525.Statics;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        try {
           int[] mas = new int[10];
           System.out.println(mas[12]);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "sdf";
            int i = Integer.parseInt(s);
            System.out.println(i);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object ss = new String();
            Integer o2 = (Integer)ss;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fstream = new FileInputStream("d");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object cat = null;
            if(cat == null){
                throw new NullPointerException("Котик не инициализирован");
            }

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object szStr[] = new String[10];
            szStr[0] = new Character('*');

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String szShortString = "123";
            char chr = szShortString.charAt(10);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int s = 30;
            if (s == 30){
                throw new UnsupportedOperationException("remove");
            }

        } catch (Exception e) {
            exceptions.add(e);
        }






    }
}
