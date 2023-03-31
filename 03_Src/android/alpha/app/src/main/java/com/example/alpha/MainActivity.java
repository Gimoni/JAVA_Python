package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.alpha.util.Alpha;
import com.example.alpha.util.Color;
import com.example.alpha.util.VT100Screen;

import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    VT100Screen  VT100;

    Alpha alpha = new Alpha();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VT100 = findViewById(R.id.VT100);
        VT100.clearScreen();

        alpha.show();
    }

    class Alpha {

        Random r = new Random();
        int line;
        int column;
        Color fg;
        Color bg;
        String str;
        char[][] ch = {
                {'=','=','=','=','=',},
                {'=',' ',' ',' ','=',},
                {'=','=','=','=','=',},
                {'=',' ',' ',' ','=',},
                {'=',' ',' ',' ','='},
        };;

        public Alpha() {
            line = 10;
            column = 20;

//            while (ch.length==' ') {
//                fg= Color.Black;
//                bg= Color.Black;
//            }
            do {
//                fg =Color.values()[2];
//                bg =Color.values()[2];
                fg =Color.Yellow;
                bg =Color.Blue;
            } while (fg==bg);

//            for(int i=0; i<ch.length; i++){
//                for(int j=0; j<ch[i].length; j++) {
//                    if (ch.length == '=') {
//                    } else
//                        fg= Color.Black;
//                        bg= Color.Black;
//                }
//            }

//            ch = ch[][];
            }


        void show() {
            VT100.cursorMove(line, column);
            VT100.setForeground(fg);
            VT100.setBackground(bg);
            for(int i=0; i<ch.length; i++){
                for(int j=0; j<ch[i].length; j++) {
                    VT100.cursorMove(line + i, column + j);
//                    VT100.setBackground(Color.Blue);
//                    VT100.setForeground(Color.Red);
                    VT100.print(ch[i][j]);
                }
            }

        }
        void hide() {
            VT100.cursorMove(line, column);
            VT100.reset();
            for(int i=0; i<ch.length; i++){
                for(int j=0; j<ch[i].length; j++)
                    VT100.cursorMove(line + i, column + j);
//                    VT100.setBackground(Color.Black);
//                    VT100.setForeground(Color.Black);
                    VT100.print(' ');
            }
        }

    }

    public void btnUp(View v) {

    }

    public void btnDown(View v) {

    }

    public void btnRight(View v) {


    }

    public void btnLeft(View v) {


    }





}