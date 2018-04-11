package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolidayName());
        System.out.println(getBubblyWine().getHolidayName());
        System.out.println(getWine().getHolidayName());
    }

    public static Drink getDeliciousDrink() {
        Drink drinkpeople = new Wine();
        return drinkpeople;
    }

    public static Wine getWine() {
        Wine newwine = new Wine();
        return newwine;
    }

    public static Wine getBubblyWine() {
        Wine bubblymubbly = new BubblyWine();
        return bubblymubbly;
    }
}
