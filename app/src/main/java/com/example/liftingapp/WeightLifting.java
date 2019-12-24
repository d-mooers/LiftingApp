package com.example.liftingapp;

import java.util.LinkedList;
import java.util.List;

public abstract class WeightLifting implements Comparable {

    private String name;
    private List<String> tutorialLinks;
    private int difficultyLevel;

    public WeightLifting(){}

    public WeightLifting(String name, int difficultyLevel) {
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

    public abstract String getMuscleGroup();
    public abstract List<String> getExampleVideoLinks();
    public abstract int compareTo(Object other);

    boolean isAlreadyIn(List<WeightLifting> lifts) {
        return lifts.contains(this);
    }

}
