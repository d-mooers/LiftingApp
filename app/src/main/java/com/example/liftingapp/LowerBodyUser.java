package com.example.liftingapp;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

public class LowerBodyUser extends User {

    private SparseArray<List<WeightLifting>> lifts;
    private int daysOnLower;

    public LowerBodyUser(String name, double experienceLevel, int daysOfExercisePerWeek) {
        super(name, experienceLevel, daysOfExercisePerWeek);
        lifts = new SparseArray<>();
        daysOnLower = (daysOfExercisePerWeek / 3) + 1;
    }

    public List<WeightLifting> getLifts(int day) {
        return lifts.get(day);
    }

    public int getDaysOnLower() {
        return daysOnLower;
    }

    public void addLift(int day, WeightLifting lift) {
        if (lifts.get(day) != null) {
            if (lift.isAlreadyIn(lifts.get(day)))
                return;
            lifts.get(day).add(lift);
        }

        lifts.put(day, new ArrayList<WeightLifting>());
        lifts.get(day).add(lift);
    }


}
