package com.javarush.task.task09.task0922;

import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        java.util.Locale.setDefault(Locale.US);
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);
        String sin = scanner.nextLine();

        Date date = new SimpleDateFormat("MM/dd/yyyy").parse(sin);

        String sout = new SimpleDateFormat("MMM dd, yyyy").format(date);

        System.out.println(sout);

//        String pattern = "MMM dd, yyyy";
//        SimpleDateFormat newformat = new SimpleDateFormat(pattern);
//        Date date = newformat.parse("AUG 18, 2013");
//        System.out.println(date);
//        System.out.println(newformat.format(oldstring));
//
//        String string = oldstring.format(new Date());
//        System.out.println(date);

//        SimpleDateFormat format = new SimpleDateFormat(oldstring);
//        System.out.println(format);
//        Date date = new SimpleDateFormat("MM-dd-yyyy").parse(oldstring);
//        Date requiredDate = date.format(new Date());
//
//        System.out.println(newstring);
    }
}