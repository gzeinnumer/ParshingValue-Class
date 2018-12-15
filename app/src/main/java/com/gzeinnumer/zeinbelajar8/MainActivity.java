package com.gzeinnumer.zeinbelajar8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnWeb, btnTelp, btnKam, btnNMahasiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnWeb = findViewById(R.id.btnWeb);
        btnTelp = findViewById(R.id.btnTelp);
        btnKam = findViewById(R.id.btnKam);
        btnNMahasiswa = findViewById(R.id.btnNMahasiswa);


        btnWeb.setOnClickListener(this);
        btnTelp.setOnClickListener(this);
        btnKam.setOnClickListener(this);
        btnNMahasiswa.setOnClickListener(this);

    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.btnWeb:
                break;
            case R.id.btnTelp:
                break;
            case R.id.btnKam:
                break;
            case R.id.btnNMahasiswa:
                Intent showNMahasiswa = new Intent(getApplicationContext(), NilaiActivity.class);
                startActivity(showNMahasiswa);
                break;
        }

    }
}
