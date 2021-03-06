package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут
            try {
                if (countSeconds <= 3){
                    for (int i = countSeconds; i > 0; i--) {
                        Thread.sleep(1000);
                        System.out.println(countSeconds);
                        countSeconds--;
                    }
                    System.out.println("Марш!");
                }
                else {
                    try {
                        for (int i = countSeconds; i > 0; i--) {
                            if (i == 1){
                                System.out.println(countSeconds);
                                break;
                            }
                            System.out.println(countSeconds);
                            Thread.sleep(1000);
                            countSeconds--;
                        }
                        System.out.println("Прервано!");
                    } catch (InterruptedException e) {
                        System.out.println("Исключение1!");
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Исключение2!");
            }
        }
    }
}
