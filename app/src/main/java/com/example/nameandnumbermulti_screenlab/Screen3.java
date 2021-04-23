package com.example.nameandnumbermulti_screenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Screen3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);

        TextView nameTV = this.findViewById(R.id.nameTV);
        nameTV.setText(MySingleton.name);
    }
}