package com.example.liftingapp;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

public class UpperBodyFocusedUser extends User {
    private SparseArray<List<WeightLifting>> lifts;
    private int daysOnUpper;

    public UpperBodyFocusedUser(String name, double experienceLevel, int daysOfExercisePerWeek)
    {
        super(name, experienceLevel, daysOfExercisePerWeek);
        lifts = new SparseArray<>();
        daysOnUpper = daysOfExercisePerWeek / 3 + 1;
    }

    public List<WeightLifting> getLifts(int day)
    {
        return lifts.get(day);
    }

    public int getDaysOnUpper() {
        return daysOnUpper;
    }

    public void setLifts(int day, WeightLifting lift)
    {
        if (lifts.get(day) != null) {
            if (lift.isAlreadyIn(lifts.get(day)))
                return;
            lifts.get(day).add(lift);
        }

        lifts.put(day, new ArrayList<WeightLifting>());
        lifts.get(day).add(lift);
    }


}
