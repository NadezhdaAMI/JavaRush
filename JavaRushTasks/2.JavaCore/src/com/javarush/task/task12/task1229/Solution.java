package com.javarush.task.task12.task1229;

/* 
Родитель класса CTO
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Guru{
        public void workHard(){
            System.out.println("a");
        };
    }

    public static class CTO extends Guru implements Businessman {

    }
}
