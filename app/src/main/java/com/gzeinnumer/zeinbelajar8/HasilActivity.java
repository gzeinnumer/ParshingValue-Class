package com.gzeinnumer.zeinbelajar8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity{
    private TextView tvNB, tvNama, tvMK, tvNUts, tvNUas,tvNTgs, tvTOT,tvNHuruf;

    private String tnobp,tnama, tmatkul,tuts, tuas, ttgs,ttot;

    private String KEY_NB ="No_Bp";
    private String KEY_NAMA ="Nama";
    private String KEY_MATKUL ="Mata_Kuliah";
    private String KEY_UTS ="UTS";
    private String KEY_UAS ="UAS";
    private String KEY_TGS ="Tugas";
    private String KEY_TOT ="Total_Nilai";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tvNB =(TextView)findViewById(R.id.tvNB);
        tvNama =(TextView)findViewById(R.id.tvNama);
        tvMK =(TextView)findViewById(R.id.tvMK);
        tvNUts =(TextView)findViewById(R.id.tvNUts);
        tvNUas =(TextView)findViewById(R.id.tvNUas);
        tvNTgs =(TextView)findViewById(R.id.tvNTgs);
        tvTOT =(TextView)findViewById(R.id.tvTOT);
        tvNHuruf =(TextView)findViewById(R.id.tvHuruf);

        Bundle data = getIntent().getExtras();
        tnobp = data.getString(KEY_NB);
        tnama = data.getString(KEY_NAMA);
        tmatkul= data.getString(KEY_MATKUL);
        tuts = data.getString(KEY_UTS);
        tuas = data.getString(KEY_UAS);
        ttgs = data.getString(KEY_TGS);
        ttot = data.getString(KEY_TOT);

        tvNB.setText(tnobp);
        tvNama.setText(tnama);
        tvMK.setText(tmatkul);
        tvNUts.setText(tuts);
        tvNUas.setText(tuas);
        tvNTgs.setText(ttgs);
        tvTOT.setText(ttot);
        double angkaHuruf = Double.parseDouble(tvTOT.getText().toString());
        if(angkaHuruf>=1 && angkaHuruf<=45){
            tvNHuruf.setText("E");
        }
        else if(angkaHuruf>46 && angkaHuruf<=55){
            tvNHuruf.setText("D");
        }
        else if(angkaHuruf>55 && angkaHuruf<=65){
            tvNHuruf.setText("C");
        }
        else if(angkaHuruf>65 && angkaHuruf<=85){
            tvNHuruf.setText("B");
        }
        else{
            tvNHuruf.setText("A");
        }
    }
}
