package com.example.liftingapp;

public class User {

    private String name;
    private double experienceLevel; // 0.00 - 100.00
    private int daysOfExercisePerWeek;

    public User() {}

    public User(String name, double experienceLevel, int daysOfExercisePerWeek)
    {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.daysOfExercisePerWeek = daysOfExercisePerWeek;
    }

    public int getDaysOfExercisePerWeek()
    {

        return daysOfExercisePerWeek;
    }
}
