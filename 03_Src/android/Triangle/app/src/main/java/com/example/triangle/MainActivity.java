package com.example.triangle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnTriangle1(View v) {
        for (int i=0; i<5; i++) {
            for (int j =0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public void btnTriangle2(View v) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5 -i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void btnTriangle3(View v) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5 -i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void btnTriangle4(View v) {
        for (int i=0; i<5; i++) {
            for (int j=1; j<6 -i -1; j++)
                System.out.print(" "); {
                for (int k = 0; k<=i; k++) {
                    System.out.print("*");
                }
            }

            System.out.println();
        }
    }
}