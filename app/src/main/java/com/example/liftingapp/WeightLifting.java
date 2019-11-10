package com.example.liftingapp;

import java.util.List;

public interface WeightLifting extends Comparable {

    String getExercise();
    double getDifficulty();
    String getMuscleGroup();
    List<String> getExampleVideoLinks();
    boolean isAlreadyIn(List<WeightLifting> lifts);

}
