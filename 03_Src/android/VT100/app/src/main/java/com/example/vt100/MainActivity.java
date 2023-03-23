package com.example.vt100;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnHello(View v) {
        Random r = new Random();
        int line = r.nextInt(20) + 1;   // [1-20]
        int column = r.nextInt(30) +1;  //[1-30]
        System.out.printf("\033[%d;%dH", line, column);
//        System.out.print("\033[36m");
        System.out.println("Hello VT100!");
    }

    public void btnClearScreen(View v) {
        System.out.print("\033[2J");
        System.out.flush();             // 출력 푸쉬
    }

    public void btnAlpha(View v) {
        Random r = new Random();
        int line = r.nextInt(20) +1;   // [1-20]
        int column = r.nextInt(40) +1;     // [1-40]
        int fg = r.nextInt(8) +30;      // [31-37]
        int bg = r.nextInt(8) +40;      // [41-47]
        char ch = (char)(r.nextInt(26) + 'A');  // [A-Z]

        System.out.printf("\033[%d;%dH", line, column);
        System.out.printf("\033[%dm", bg);
        System.out.printf("\033[%dm", bg);
        System.out.print(ch);
        System.out.flush();
    }

    public void btnReset(View v) {
        System.out.printf("\033[0m");
        System.out.flush();
    }

    public void btnTriangle1(View v) {
        Random r = new Random();
        char s = (char)(42);
        for (int i=0; i<5; i++) {
            for (int j =0; j<i+1; j++) {
                System.out.print(s);
//                System.out.flush();
            }
            System.out.println();
        }

    }
    public void btnTriangle2(View v) {
        Random r = new Random();
        char s = (char)(42);
        for (int i=0; i<5; i++) {
            for (int j=0; j<5 -i; j++ ) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public void btnTriangle3(View v) {
        Random r = new Random();
        char s = (char)(42);
        for (int i=0; i<5; i++) {
            for (int j=0; j<5 -i; j++ ) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public void btnTriangle4(View v) {
        Random r = new Random();
        char s = (char)(42);
        for (int i=0; i<5; i++) {
            for (int j=1; j<6 -i -1; j++)
                System.out.print(" "); {
                for (int k = 0; k<=i; k++) {
                    System.out.print(s);
                }
            }

            System.out.println();
        }
    }

}