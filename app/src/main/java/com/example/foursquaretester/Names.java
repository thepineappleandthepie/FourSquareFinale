package com.example.foursquaretester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Names extends AppCompatActivity {
    private EditText playerX;
    private EditText playerO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_names);
        playerX=  findViewById(R.id.textInputEditText2);
        playerO = findViewById(R.id.textInputEditText);
    }

    public void homebutton2tap(View scr){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void playtap(View scr){
        String NameX = playerX.getText().toString();
        String NameO = playerO.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("NameX", NameX);
        bundle.putString("NameO", NameO);
        Intent intent = new Intent(this, Game.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}

