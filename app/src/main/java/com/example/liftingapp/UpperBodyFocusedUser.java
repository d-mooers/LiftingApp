package com.example.liftingapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UpperBodyFocusedUser extends User {
    private Map<Integer, List<WeightLifting>> lifts;
    private int daysOnChest;

    public UpperBodyFocusedUser(String name, double experienceLevel, int daysOfExercisePerWeek)
    {
        super(name, experienceLevel, daysOfExercisePerWeek);
        lifts = new HashMap<>();
        daysOnChest = super.getDaysOfExercisePerWeek() / 3 + 1;
    }

    public List<WeightLifting> getLifts(int day)
    {
        return lifts.get(day);
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
