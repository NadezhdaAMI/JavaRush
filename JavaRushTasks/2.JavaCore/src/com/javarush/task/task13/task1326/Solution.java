//package com.javarush.task.task13.task1326;
//
///*
//Сортировка четных чисел из файла
//*/
//
//import com.sun.org.apache.xml.internal.utils.res.IntArrayWrapper;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//import java.util.TreeMap;
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        // напишите тут ваш код
//        Scanner n = new Scanner(System.in);
//        String namefile = n.next();
//        File file = new File("/home/nadezhda/JAVA_learning/JavaRushTasks/2.JavaCore/src/com/javarush/task/task13/task1326/" + namefile + ".txt");
//
//        InputStream inputStream = new FileInputStream(file);
//        int[] mas = new int[20];
//        int i = 0;
//        String number = "";
//        while (inputStream.available() > 0){
//
//            int next = inputStream.read();
//            char nextchar = (char)next;
//            if (nextchar != '\n'){
//                number +=nextchar;
//            }
//            else {
//                mas[i] = Integer.parseInt(number);
//                i++;
//                number = "";
//            }
//        }
//
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int j = 0; j < mas.length; j++) {
//            if ((mas[j] != 0) && (mas[j] % 2 == 0)){
//                list.add(mas[j]);
//            }
//        }
//
//        Collections.sort(list);
//        for (int ik = 0; ik < list.size() ; ik++) {
//            System.out.println(list.get(ik));
//        }
//
//        inputStream.close();
//    }
//}
