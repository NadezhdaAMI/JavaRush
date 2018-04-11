package com.javarush.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
Список и нити
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        //Add your code here - добавьте свой код тут
        SpecialThread job1 = new SpecialThread();
        Thread mythred1 = new Thread(job1);
        list.add(mythred1);

        SpecialThread job2 = new SpecialThread();
        Thread mythred2 = new Thread(job2);
        list.add(mythred2);

        SpecialThread job3 = new SpecialThread();
        Thread mythred3 = new Thread(job3);
        list.add(mythred3);

        SpecialThread job4 = new SpecialThread();
        Thread mythred4 = new Thread(job4);
        list.add(mythred4);

        SpecialThread job5 = new SpecialThread();
        Thread mythred5 = new Thread(job5);
        list.add(mythred5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
