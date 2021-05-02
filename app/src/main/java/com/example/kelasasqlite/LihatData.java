package com.example.kelasasqlite;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kelasasqlite.database.DBController;
import com.google.android.material.textfield.TextInputEditText;

public class LihatData extends AppCompatActivity {
    static TextView tvnama,tvtelp;
    String nm,id,tlp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);
        tvnama = findViewById(R.id.tvNamaKontak);
        tvtelp = findViewById(R.id.tvNomorTelepon);

        id = getIntent().getStringExtra("id");
        nm = getIntent().getStringExtra("nama");
        tlp = getIntent().getStringExtra("telp");

        setTitle("Detail Data");
        tvnama.setText(nm);
        tvtelp.setText(tlp);
    }
}