package com.example.foursquaretester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rulebuttontap(View scr){
        Intent intent = new Intent(this, Rules.class);
        startActivity(intent);
    }
    public void play1buttontap(View scr){
        Intent intent = new Intent(this, Names.class);
        startActivity(intent);
    }
}