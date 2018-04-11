package com.javarush.task.task13.task1326;

/*
Сортировка четных чисел из файла
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        Solution2 solution = new Solution2();
        Scanner n = new Scanner(System.in);
        String namefile = n.next();
        File file = new File("/home/nadezhda/JAVA_learning/JavaRushTasks/2.JavaCore/src/com/javarush/task/task13/task1326/" + namefile + ".txt");
        int[] array = solution.getData(file);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if ((array[i] != 0) && (array[i] % 2 == 0)){
                list.add(array[i]);
            }
        }

        Collections.sort(list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
    public int[] getData(File file) throws IOException{
        InputStream inputStream = new FileInputStream(file);
//        Scanner scanner = new Scanner(file);
        int[] mas = new int[20];
        int i = 0;
//        while (scanner.hasNextInt()){
//            mas[i] = scanner.nextInt();
//            i++;
//        }
        String number = "";
        while (inputStream.available() > 0){

            int next = inputStream.read();
            char nextchar = (char)next;
            if (nextchar != '\n'){
                number +=nextchar;
            }
//            System.out.println(number + " ");
            else {
                mas[i] = Integer.parseInt(number);
                i++;
                number = "";
            }
        }
        inputStream.close();
        return mas;
    }
}
