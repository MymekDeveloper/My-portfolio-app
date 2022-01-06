package com.example.szwedprojectportfolio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Project gettingStartedProject = new Project("Getting Started App", "Our very first project", 5);

        Project[] projects = {

                new Project("Getting Started App", "Our very first project", 5),
                new Project("Motivation quote", "Making a simple change to the layout, with my personal motivation quote", 5),
                new Project("BMI Calculator", "Working BMI calculator", 5),
                new Project("Inches Convertor", "A basic converter to convert inches to meters", 5),
                new Project("Rap&Pub", "Restaurant's application with distinguished menu", 5)
        };


    }
}