package com.example.liftingapp;

import android.content.Context;
import android.content.res.AssetManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ParseLifts {

    public List<WeightLifting> parseLifts (String fileName) {
        BufferedReader reader = null;
        List<WeightLifting> lifts = new ArrayList<>()
        try {
            AssetManager assetManager = Context.getAssets();
            reader = new BufferedReader(
                    new InputStreamReader(assetManager.open("filename.txt")));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                parseLine(mLine, lifts);
            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }
        return lifts;
    }

    private void parseLine(String line, List<WeightLifting> lifts) {
        String[] fields = line.split("\t");
        WeightLifting lift = new WeightLifting(fields[0], Integer.parseInt(fields[2]),
                                    Double.parseDouble(fields[3]));
        lifts.add(lift);
    }
}
