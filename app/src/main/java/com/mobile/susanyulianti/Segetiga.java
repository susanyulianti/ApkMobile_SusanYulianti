package com.mobile.susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segetiga extends AppCompatActivity {

    private EditText E_Alas;
    private EditText E_Tinggi;
    private Button B_Luas;
    private TextView H_Luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segetiga);

        E_Alas = findViewById(R.id.alas);
        E_Tinggi = findViewById(R.id.tinggi);
        B_Luas = findViewById(R.id.hitungluas);
        H_Luas = findViewById(R.id.hluas);

        //listener luas
        B_Luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hitungluas();
            }
        });
    }

    private void hitungluas() {
        String Alas = E_Alas.getText().toString();
        String Tinggi = E_Tinggi.getText().toString();
        // aritmatik
        double luas = 0.5 * Integer.parseInt(Alas) * Integer.parseInt(Tinggi);
        H_Luas.setText("Nilai Luasnya Adalah : " + luas);
    }
}