package com.example.nameandnumbermulti_screenlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Screen2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.nameTV);
        Intent myIntent = this.getIntent();
        this.number = myIntent.getStringExtra(" ");
        nameTV.setText(MySingleton.name);
    }

    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        this.startActivity(i);
    }
}