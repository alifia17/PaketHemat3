package com.android.alif.pakethemat3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MusicActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton btnbts;
    ImageButton btnbp;
    ImageButton btnariana;
    ImageButton btndua;
    ImageButton btnhivi;
    ImageButton btniu;
    ImageButton btnjustin;
    ImageButton btnraisa;
    ImageButton btnran;
    ImageButton btnrv;
    ImageButton btnshawn;
    ImageButton btntulus;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        btnbts = (ImageButton) findViewById(R.id.btn_bts);
        btnbts.setOnClickListener(this);

        btnbp = (ImageButton) findViewById(R.id.btn_bp);
        btnbp.setOnClickListener(this);

        btnariana = (ImageButton) findViewById(R.id.btn_ariana);
        btnariana.setOnClickListener(this);

        btndua = (ImageButton) findViewById(R.id.btn_dua);
        btndua.setOnClickListener(this);

        btnhivi = (ImageButton) findViewById(R.id.btn_hivi);
        btnhivi.setOnClickListener(this);

        btniu = (ImageButton) findViewById(R.id.btn_iu);
        btniu.setOnClickListener(this);

        btnjustin = (ImageButton) findViewById(R.id.btn_justin);
        btnjustin.setOnClickListener(this);

        btnraisa = (ImageButton) findViewById(R.id.btn_raisa);
        btnraisa.setOnClickListener(this);

        btnran = (ImageButton) findViewById(R.id.btn_ran);
        btnran.setOnClickListener(this);

        btnrv = (ImageButton) findViewById(R.id.btn_rv);
        btnrv.setOnClickListener(this);

        btnshawn = (ImageButton) findViewById(R.id.btn_shawn);
        btnshawn.setOnClickListener(this);

        btntulus = (ImageButton) findViewById(R.id.btn_tulus);
        btntulus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_bts:
                startActivity(new Intent(MusicActivity.this, Musikbts.class));
                break;

            case R.id.btn_bp:
                startActivity(new Intent(MusicActivity.this, musikblackpink.class));
                break;

            case R.id.btn_ariana:
                startActivity(new Intent(MusicActivity.this, Musikariana.class));
                break;
            case R.id.btn_dua:
                startActivity(new Intent(MusicActivity.this, Musikdua.class));
                break;
            case R.id.btn_hivi:
                startActivity(new Intent(MusicActivity.this, Musikhivi.class));
                break;
            case R.id.btn_iu:
                startActivity(new Intent(MusicActivity.this, Musikiu.class));
                break;
            case R.id.btn_justin:
                startActivity(new Intent(MusicActivity.this, Musikjustin.class));
                break;
            case R.id.btn_raisa:
                startActivity(new Intent(MusicActivity.this, Musikraisa.class));
                break;
            case R.id.btn_ran:
                startActivity(new Intent(MusicActivity.this, Musikran.class));
                break;
            case R.id.btn_rv:
                startActivity(new Intent(MusicActivity.this, Musikrv.class));
                break;
            case R.id.btn_shawn:
                startActivity(new Intent(MusicActivity.this, Musikshawn.class));
                break;
            case R.id.btn_tulus:
                startActivity(new Intent(MusicActivity.this, Musiktulus.class));
                break;
        }
    }
}