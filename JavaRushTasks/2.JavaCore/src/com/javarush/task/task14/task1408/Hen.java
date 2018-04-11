package com.javarush.task.task14.task1408;

/**
 * Created by Nadezhda on 15.05.2017.
 */
public abstract class Hen {
    public String CountryHen;

    public abstract int getCountOfEggsPerMonth();

    public String getDescription(){
        return "Я - курица.";
    }

}
