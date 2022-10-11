package com.example.foursquaretester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Winner extends AppCompatActivity {
    private String result = "IT WAS A DRAW!!!!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        final TextView results = (TextView) findViewById(R.id.textView2);
        results.setText(result);
    }
    public void playagainbuttontap(View scr){
        Intent intent = new Intent(this, Game.class);
        startActivity(intent);
    }
    public void home4button5tap(View scr){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}