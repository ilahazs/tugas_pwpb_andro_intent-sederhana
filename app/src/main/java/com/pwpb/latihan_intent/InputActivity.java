package com.pwpb.latihan_intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {
    private EditText bilangan1;
    private EditText bilangan2;
    private EditText jumlah;
    private Button btnHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);
        initUI();
        initEvent();
    }

    private void initUI() {
        bilangan1 = (EditText) findViewById(R.id.bilangan1);
        bilangan2 = (EditText) findViewById(R.id.bilangan2);
        jumlah = (EditText) findViewById(R.id.jumlah);
        btnHasil = (Button) findViewById(R.id.btnHasil);
    }

    private void initEvent() {
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah() {
        int angka1 = Integer.parseInt(bilangan1.getText().toString().matches("") ? "0" : bilangan1.getText().toString());
        int angka2 = Integer.parseInt(bilangan2.getText().toString().matches("") ? "0" : bilangan2.getText().toString());
        int total = angka1 + angka2;

        jumlah.setText(String.valueOf(total));
    }
}