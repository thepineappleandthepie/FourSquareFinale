package com.example.foursquaretester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }
    public void playbutton2tap(View scr){
        Intent intent = new Intent(this, Names.class);
        startActivity(intent);
    }
    public void home1buttontap(View scr){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}