package com.example.liftingapp;

import java.util.LinkedList;
import java.util.List;

public class WeightLifting implements Comparable {

    private String name;
    private List<String> tutorialLinks;
    private int difficultyLevel; //Between 0 and 100
    private double averageTime;

    public WeightLifting(){}

    public WeightLifting(String name, int difficultyLevel, double averageTime) {
        this.name = name;
        this.tutorialLinks = new LinkedList<>();
        this.difficultyLevel = difficultyLevel;
    }

    public WeightLifting(String name, List<String> tutorialLinks, int difficultyLevel) {
        this.name = name;
        this.tutorialLinks = tutorialLinks;
        this.difficultyLevel = difficultyLevel;
    }

    public String getName() {
        return name;
    }

    public double getDifficulty(){
        return difficultyLevel;
    }

    public  String getMuscleGroup() {return null;}
    public  List<String> getExampleVideoLinks() {return null;}
    public  int compareTo(Object other) {
        if (other.getClass() != getClass())
            return 0;
        WeightLifting o = (WeightLifting) other;
        return difficultyLevel - o.difficultyLevel;}

    boolean isAlreadyIn(List<WeightLifting> lifts) {
        return lifts.contains(this);
    }

}
