package com.example.clockapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //sydney clock
        ConstraintLayout sydney = findViewById(R.id.sydney);
        ImageView sydneyIcon = sydney.findViewById(R.id.cityImage);
        sydneyIcon.setImageResource(R.drawable.sydney);
        TextView sydneyText = sydney.findViewById(R.id.name);
        sydneyText.setText("Sydney");
        TextView sydneyTime = sydney.findViewById(R.id.time);
        sydneyTime.setText("00:00");
        //moscow clock
        ConstraintLayout moscow = findViewById(R.id.moscow);
        ImageView moscowIcon = moscow.findViewById(R.id.cityImage);
        moscowIcon.setImageResource(R.drawable.moscow);
        TextView moscowText = moscow.findViewById(R.id.name);
        moscowText.setText("Moscow");
        TextView moscowTime = moscow.findViewById(R.id.time);
        moscowTime.setText("00:00");
        //ny clock
        ConstraintLayout ny = findViewById(R.id.ny);
        ImageView nyIcon = ny.findViewById(R.id.cityImage);
        nyIcon.setImageResource(R.drawable.newyork);
        TextView nyText = ny.findViewById(R.id.name);
        nyText.setText("New York");
        TextView nyTime = ny.findViewById(R.id.time);
        nyTime.setText("00:00");
        //london clock
        ConstraintLayout london = findViewById(R.id.london);
        ImageView londonIcon = london.findViewById(R.id.cityImage);
        londonIcon.setImageResource(R.drawable.london);
        TextView londonText = london.findViewById(R.id.name);
        londonText.setText("London");
        TextView londonTime = london.findViewById(R.id.time);
        londonTime.setText("00:00");
        //beijing clock
        ConstraintLayout beijing = findViewById(R.id.beijing);
        ImageView beijingIcon = beijing.findViewById(R.id.cityImage);
        beijingIcon.setImageResource(R.drawable.beijing);
        TextView beijingText = beijing.findViewById(R.id.name);
        beijingText.setText("Beijing");
        TextView beijingTime = beijing.findViewById(R.id.time);
        beijingTime.setText("00:00");
        //tokyo clock
        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        ImageView tokyoIcon = tokyo.findViewById(R.id.cityImage);
        tokyoIcon.setImageResource(R.drawable.tokyo);
        TextView tokyoText = tokyo.findViewById(R.id.name);
        tokyoText.setText("Tokyo");
        TextView tokyoTime = tokyo.findViewById(R.id.time);
        tokyoTime.setText("00:00");
    }
}
