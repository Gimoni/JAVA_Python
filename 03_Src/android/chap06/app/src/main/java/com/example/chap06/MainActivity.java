package com.example.chap06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.chap06.util.Color;
import com.example.chap06.util.VT100Screen;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {

    static VT100Screen VT100;

    Timer timer;

    boolean isStart = false;

    static Random r = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VT100 = findViewById(R.id.VT100);
    }

    static enum Direction {
        Up, Down, Left, Right
    }

    static class RunAlpha extends TimerTask {
        static Random r = new Random();

        int line;
        int column;
        Color fg;
        Color bg;
        char ch;

        Direction direction;

        public RunAlpha(char ch) {
            line = 1;
            column = 1;
            this.ch = ch;

            do {
                fg = Color.values()[r.nextInt(8)];
                bg = Color.values()[r.nextInt(8)];
            } while (fg == bg);

            direction = Direction.Right;

            show();
        }

        void show() {
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            VT100.print(ch);
        }

        void hide() {
            VT100.cursorMove(line, column);
            VT100.reset();
            VT100.print(' ');
        }

        @Override
        public void run() {
            hide();

            if (line==1 && column==35)
                direction = Direction.Down;
            else if (line==20 && column==35)
                direction = Direction.Left;
            else if (line==20 && column==1)
                direction = Direction.Up;
            else if (line==1 && column==1)
                direction = Direction.Right;

            switch (direction) {
                case Right:
                    column++;
                    break;
                case Down:
                    line++;
                    break;
                case Left:
                    column--;
                    break;
                case Up:
                    line--;
                    break;

                default:
                    break;
            }
            show();
        }
    }

    public void btnStart(View v) {

        if (isStart==false) {
            timer = new Timer();

            VT100.reset();
            VT100.clearScreen();

            for (int i=0; i<26; i++) {
                RunAlpha ra = new RunAlpha((char)('A'+i));
                timer.schedule(ra, 0, RunAlpha.r.nextInt(50) +1);
            }

//            Blink java = new Blink("java");
//            timer.schedule(java, 0, 100);
//
//            Blink python = new Blink("python");
//            timer.schedule(python, 0, 500);
//
//            Blink android = new Blink("android");
//            timer.schedule(android, 0, 300);
//
//            Blink oracle = new Blink("oracle");
//            timer.schedule(oracle, 0, 200);

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