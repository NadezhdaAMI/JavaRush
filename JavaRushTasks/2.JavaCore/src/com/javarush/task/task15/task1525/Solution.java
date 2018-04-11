package com.javarush.task.task15.task1525;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        try{
            FileInputStream fstream = new FileInputStream(Statics.FILE_NAME);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                lines.add(strLine);
            }
        }catch (IOException e){
            System.out.println("Ошибка!");
        }
    }


    public static void main(String[] args) throws Exception {
//
        System.out.println(lines);
    }
}
