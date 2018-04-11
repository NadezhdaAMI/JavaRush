package com.javarush.task.task16.task1623;

/*
Рекурсивное создание нитей
*/

public class Solution {
    static int count = 15;
    static volatile int countCreatedThreads;

    public static void main(String[] args) {

//        for (int i = 0; i < count; i++) {
//            System.out.println(new GenerateThread());
//            Thread.currentThread().interrupt();
//        }
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread{
        public GenerateThread() {
            super(String.valueOf(++countCreatedThreads));
            start();
        }
        public void run() {
            if (countCreatedThreads < Solution.count) {
                GenerateThread generateThread = new GenerateThread();
                System.out.println(generateThread);

            }
        }

        @Override
        public String toString() {
            return this.getName() + " created";
        }
    }
}
