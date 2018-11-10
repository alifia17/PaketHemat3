package com.android.alif.pakethemat3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.DialogInterface;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;



public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnPromo;
    Button btnIntro;
    Button btnSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnPromo = (Button) findViewById(R.id.button_promo);
        btnPromo.setOnClickListener(this);

        btnIntro = (Button) findViewById(R.id.button_pmh3);
        btnIntro.setOnClickListener(this);

        btnSong = (Button) findViewById(R.id.btn_song);
        btnSong.setOnClickListener(this);


    }


    public void btnCall(View view) {
        AlertDialog ad = new AlertDialog.Builder(this).create();
        ad.setMessage("Your Waitress Has Coming To You");
        ad.show();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.button_pmh3:
                startActivity(new Intent(HomeActivity.this, Introduction.class));
                break;
            case R.id.button_promo:
            PrefManager prefManager = new PrefManager(getApplicationContext());
            prefManager.setFirstTimeLaunch(true);
            startActivity(new Intent(HomeActivity.this, WelcomeActivity.class));
            finish();
        break;
            case R.id.btn_song:
                startActivity(new Intent(HomeActivity.this, splashmusic.class));
                break;


        }
    }

}

