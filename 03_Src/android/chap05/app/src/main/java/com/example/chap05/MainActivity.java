package com.example.chap05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chap05.util.Color;
import com.example.chap05.util.VT100Screen;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    VT100Screen VT100;

    Timer timer;

    boolean isStart = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VT100 = findViewById(R.id.VT100);
    }

    Random r = new Random();

    class Blink extends TimerTask {

        int line;
        int column;
        Color fg;
        Color bg;

        String str;

        public Blink(String str) {
            line = r.nextInt(20)+1;
            column = r.nextInt(30) +1;
            do {
                fg = Color.values()[r.nextInt(8)];
                bg = Color.values()[r.nextInt(8)];
            }   while (fg==bg);
                this.str = str;
        }

        void show() {
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            VT100.print(str);
        }

        void hide() {
            VT100.cursorMove(line, column);
            VT100.reset();
            for (int i=0; i<str.length(); i++)
                VT100.print(' ');
        }

        boolean blink = true;
        @Override
        public void run() {
            if (blink==true)
                show();
            else
                hide();

            blink = !blink;
        }
    }



    public void btnStart(View v) {
//        for (int i=0; i<60; i++)
//            VT100.println(i+"");

        if (isStart==false) {
            timer = new Timer();

            VT100.reset();
            VT100.clearScreen();

            Blink java = new Blink("java");
            timer.schedule(java, 0, 100);

            Blink python = new Blink("python");
            timer.schedule(python, 0, 500);

            Blink android = new Blink("android");
            timer.schedule(android, 0, 300);

            Blink oracle = new Blink("oracle");
            timer.schedule(oracle, 0, 200);

            isStart = true;
        }
    }

    public void btnStop(View v) {
        if (isStart==true) {
            timer.cancel();

            isStart = false;
        }
    }


}