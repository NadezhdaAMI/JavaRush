package com.javarush.task.task14.task1408;

/**
 * Created by Nadezhda on 15.05.2017.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 50;
    };
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    };

}
