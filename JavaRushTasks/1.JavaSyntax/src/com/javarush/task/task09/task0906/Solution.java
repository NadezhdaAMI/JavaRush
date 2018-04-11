package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String s1 = stackTraceElements[1].getClassName();
        String s2 = stackTraceElements[1].getMethodName();
        System.out.println(s1 + ": " + s2 + " : " + s);
    }
}
