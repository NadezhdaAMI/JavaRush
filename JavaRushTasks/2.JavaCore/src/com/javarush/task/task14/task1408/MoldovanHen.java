package com.javarush.task.task14.task1408;

/**
 * Created by Nadezhda on 15.05.2017.
 */
public class MoldovanHen extends Hen {
    public int getCountOfEggsPerMonth(){
        return 40;
    };
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    };
}
