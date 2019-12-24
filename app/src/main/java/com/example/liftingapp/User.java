package com.example.liftingapp;

public class User {

    private String name;  // name of user
    private double experienceLevel; // 0.00 - 100.00
    private int daysOfExercisePerWeek;
    private double timeGoal;  // minutes per gym session

    public User() {}

    public User(String name, double experienceLevel, int daysOfExercisePerWeek, double timeGoal)
    {
        this.name = name;
        this.experienceLevel = experienceLevel;
        this.daysOfExercisePerWeek = daysOfExercisePerWeek;
        this.timeGoal = timeGoal;
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

    public double getTimeGoal() {
        return timeGoal;
    }
}
