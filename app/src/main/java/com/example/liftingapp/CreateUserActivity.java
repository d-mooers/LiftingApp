package com.example.liftingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class CreateUserActivity extends AppCompatActivity {

    EditText nameField;
    EditText daysField;
    EditText minutesField;
    EditText experienceField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_create_user);
    nameField = findViewById(R.id.userName);
    daysField = findViewById(R.id.daysExercise);
    minutesField = findViewById(R.id.timePerSession);
    experienceField = findViewById(R.id.experienceLevel);
    }

    protected void parseUser(View view) {
        String name = nameField.getText().toString();
        int daysAvail = Integer.parseInt(daysField.getText().toString());
        int minutesPerSession = Integer.parseInt((minutesField.getText().toString()));
        int experienceLevel = Integer.parseInt(experienceField.getText().toString());

        User newUser = new User(name, experienceLevel, daysAvail, minutesPerSession);


    }
}
