package com.example.praktikum2;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class skor_layout extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_skor);
        TextView namaTimA = findViewById(R.id.TimA);
        TextView namaTimB = findViewById(R.id.TimB);
        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");
        namaTimA.setText("Team" + " " + namaA);
        namaTimB.setText("Team" + " " + namaB);
    }
    public void Tambah(View view) {
        if (view.getId() == R.id.satua) {
            skorA = skorA+1;
        } else if (view.getId() == R.id.duaa) {
            skorA = skorA+2;
        } else if (view.getId() == R.id.tigaa) {
            skorA = skorA+3;
        } else if (view.getId() == R.id.satub) {
            skorB = skorB+1;
        } else if (view.getId() == R.id.duab) {
            skorB = skorB+2;
        } else if (view.getId() == R.id.tigab) {
            skorB = skorB+3;
        }
        TextView skorTimA = findViewById(R.id.skorA);
        TextView skorTimB = findViewById(R.id.skorB);
        skorTimA.setText(String.valueOf(skorA));
        skorTimB.setText(String.valueOf(skorB));
    }

    public void Reset(View view){
        if(view.getId()==R.id.ResetA){
            skorA=0;
        }
        else if (view.getId()==R.id.ResetB){
            skorB=0;
        }
        TextView skortimA = findViewById(R.id.skorA);
        TextView skortimB = findViewById(R.id.skorB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}