package com.javarush.task.task14.task1408;

/**
 * Created by Nadezhda on 15.05.2017.
 */
public class BelarusianHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 60;
    };
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    };
}
