package com.example.liftingapp;

public class User {

    private String name;  // name of user
    private int experienceLevel; // 0.00 - 100.00
    private int daysOfExercisePerWeek;
    private int minPerSession;  // minutes per gym session

    public User() {}

    public User(String name, int experienceLevel, int daysOfExercisePerWeek, int minPerSession)
    {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.daysOfExercisePerWeek = daysOfExercisePerWeek;
        this.minPerSession = minPerSession;
    }

    public int getDaysOfExercisePerWeek()
    {
        return daysOfExercisePerWeek;
    }

    public String getName() {
        return name;
    }

    public double getExperienceLevel() {
        return experienceLevel;
    }

    public double getMinPerSession() {
        return minPerSession;
    }

    public UpperBodyFocusedUser convertToUpper() {
        return new UpperBodyFocusedUser(name, experienceLevel, daysOfExercisePerWeek, minPerSession);
    }

    public LowerBodyUser convertToLower() {
        return new LowerBodyUser(name, experienceLevel, daysOfExercisePerWeek, minPerSession);
    }
}
