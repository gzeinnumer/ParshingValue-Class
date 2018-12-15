package com.gzeinnumer.zeinbelajar8;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NilaiActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText etNP, etNama, etMK, etNUts, etNUas, etNTgs;
    private Button btnProsesNilai;
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
        setContentView(R.layout.activity_nilai);
        etNP=(EditText) findViewById(R.id.etNB);
        etNama=(EditText) findViewById(R.id.etNama);
        etMK=(EditText) findViewById(R.id.etMK);
        etNUas=(EditText) findViewById(R.id.etNUas);
        etNUts=(EditText) findViewById(R.id.etNUts);
        etNTgs=(EditText) findViewById(R.id.etNTgs);
        btnProsesNilai = (Button) findViewById(R.id.btnProsesNilai);

        btnProsesNilai.setOnClickListener(this);
    }
    public void onClick(View v){
        String var1 = etNP.getText().toString();
        String var9 = etNama.getText().toString();
        String var2 = etMK.getText().toString();
        String var3 = etNUts.getText().toString();
        String var4 = etNUas.getText().toString();
        String var5 = etNTgs.getText().toString();
        Double var6 = Double.valueOf(var3);
        Double var7 = Double.valueOf(var4);
        Double var8 = Double.valueOf(var5);

        Double pointUts = 0.3 * var6;
        Double pointUas = 0.4 * var7;
        Double pointTgs = 0.3 * var8;
        Double pointTotal = pointUts+pointTgs+pointUas;

        //kirim ke activity lain
        Intent i = new Intent(NilaiActivity.this, HasilActivity.class);
        i.putExtra(KEY_NB,var1);
        i.putExtra(KEY_NAMA,var9);
        i.putExtra(KEY_MATKUL,var2);
        i.putExtra(KEY_UTS,String.valueOf(pointUts));
        i.putExtra(KEY_UAS,String.valueOf(pointUas));
        i.putExtra(KEY_TGS,String.valueOf(pointTgs));
        i.putExtra(KEY_TOT,String.valueOf(pointTotal));
        startActivity(i);
    }
}
