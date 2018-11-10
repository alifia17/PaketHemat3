package com.android.alif.pakethemat3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.android.alif.pakethemat3.R;

public class MainActivity extends AppCompatActivity {

    private int waktu_loading=3000; // 3Sec

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               // setelah load pindah ke .. slider
                Intent WelcomeActivity =new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(WelcomeActivity);
                finish();
            }
        },waktu_loading);
    }
}
