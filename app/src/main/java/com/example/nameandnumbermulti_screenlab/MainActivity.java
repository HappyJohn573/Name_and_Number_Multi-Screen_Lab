package com.example.nameandnumbermulti_screenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onNextScreenButtonClicked(View v)
    {
        Intent i = new Intent(this, Screen2.class);
        i.putExtra("number", " ");
        this.startActivity(i);
    }
}