package com.example.chap01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    static int count=0;
    public void btnLogCat_clicked(View v) {
        System.out.println("버튼 클릭..." + count++);
    }
}