package com.example.foursquaretester;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Game extends AppCompatActivity {
    private Button[][] GameBoard = new Button[4][4];
    private String[][] Move = new String[4][4];
    private int MoveCnt = 0;
    private TextView PlayersTurn;
    private String XName = "Player 1";
    private String OName = "Player 2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null){
            XName = bundle.getString("NameX");
            OName = bundle.getString("NameO");
        }

        for (int x = 0; x < 4; x++) {
            for (int c = 0; c < 4; c++) {
                String buttonID = "button" + x + c;
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                GameBoard[x][c] = findViewById(resID);
            }
        }

    }
    public void onClick(View scr) {
        final TextView PlayersTurn = (TextView) findViewById(R.id.textView2);
        Button b = (Button) scr;
        String Butt = b.getText().toString();
        if (MoveCnt % 2 == 0) {
            if (MoveCnt >= 2) {
                if (Butt.equals(" ") || Butt.equals("")) {
                    b.setText("X");
                    MoveCnt++;
                    PlayersTurn.setText(OName);
                }
            } else {
                if (Butt.equals("")) {
                    PlayersTurn.setText(OName);
                    b.setText("X");
                    MoveCnt++;
                }
            }
        } else {
            if (MoveCnt >= 2) {
                if (Butt.equals(" ") || Butt.equals("")) {
                    PlayersTurn.setText(XName);
                    b.setText("O");
                    MoveCnt++;

                }
            } else {
                if (Butt.equals("")) {
                    b.setText("O");
                    MoveCnt++;
                    PlayersTurn.setText(XName);
                }
            }

        }
        if(win_checker()){
            Intent intent = new Intent(this, Winner.class);
            startActivity(intent);
        }
        if(MoveCnt==15){
            Intent intent = new Intent(this, Winner.class);
            startActivity(intent);
        }
    }
    private boolean win_checker(){
        return false;
    }
    public void Retry(View scr){
        for (int x = 0; x < 4; x++) {
            for (int c = 0; c < 4; c++) {
                GameBoard[x][c].setText("");
                Move[x][c] = ("");
            }
        }
        MoveCnt=0;
    }
    public void homebutton3tap(View scr){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}