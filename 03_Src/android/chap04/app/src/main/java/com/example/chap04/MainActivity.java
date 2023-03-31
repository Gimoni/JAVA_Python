package com.example.chap04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chap04.util.Color;
import com.example.chap04.util.VT100Screen;

public class MainActivity extends AppCompatActivity {


    VT100Screen VT100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VT100 = findViewById(R.id.VT100);
    }

    public void btnStart(View v){
        VT100.clearScreen();
        VT100.cursorMove(10,10);
        VT100.setForeground(Color.RED);
        VT100.setBackground(Color.BLUE);
        VT100.print("Start");
    }

    public void btnStop(View v){
        VT100.clearScreen();
        VT100.cursorMove(10,10);
        VT100.setForeground(Color.BLUE);
        VT100.setBackground(Color.RED);
        VT100.print("Stop");
    }
}