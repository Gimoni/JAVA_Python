package com.example.chap03;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chap03.util.Color;
import com.example.chap03.util.VT100;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Timer timer;

    static class Blink extends TimerTask {
        static Random r = new Random();

        int line;
        int column;
        Color fg;
        Color bg;
        String str;

        public Blink(String str) {
            line = r.nextInt(18) + 2;
            column = r.nextInt(38) + 2;
            do {
                fg = Color.values()[r.nextInt(8)];
                bg = Color.values()[r.nextInt(8)];
            } while (fg==bg);

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

            String blank="";
            for (int i=0; i<str.length(); i++)
                blank += ' ';

            VT100.print(blank);
        }

        boolean blink = true;

        @Override
        public void run() {

            if (blink)
                show();
            else
                hide();

            blink = !blink;
        }

    }


    boolean isStart = false;
    public void btnStart(View v) {
        if (isStart == false) {
            timer = new Timer();

            VT100.reset();
            VT100.clearScreen();

            Blink java = new Blink("Java");
            timer.schedule(java, 0, 100);

            Blink python = new Blink("Python");
            timer.schedule(python, 0, 500);

            Blink android = new Blink("Android");
            timer.schedule(android, 0, 1000);

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