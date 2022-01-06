package com.example.szwedprojectportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project gettingStartedProject = new Project("Getting Started App", "Our very first project", 5);

        Project[] projects = {

                new Project("Getting Started App", "Our very first project", R.drawable.getting_started),
                new Project("Motivation quote", "Making a simple change to the layout, with my personal motivation quote", R.drawable.quote),
                new Project("BMI Calculator", "Working BMI calculator", R.drawable.calculator   ),
                new Project("Inches Convertor", "A basic converter to convert inches to meters", R.drawable.tape),
                new Project("Rap&Pub", "Restaurant's application with distinguished menu", R.drawable.hungry_developer)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}