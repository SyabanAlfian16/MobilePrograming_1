package com.example.belajarandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText inpNama = (EditText) findViewById(R.id.inpNama);
        EditText inpno_hp = (EditText) findViewById(R.id.inpno_hp);
        EditText inpAlamat = (EditText) findViewById(R.id.inpAlamat);

        Button btnHAPUS = (Button) findViewById(R.id.btnHAPUS);

        btnHAPUS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inpNama.setText("");
                inpno_hp.setText("");
                inpAlamat.setText("");
            }
        });

        Button btnEXIT = (Button) findViewById(R.id.btnEXIT);

        btnEXIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}