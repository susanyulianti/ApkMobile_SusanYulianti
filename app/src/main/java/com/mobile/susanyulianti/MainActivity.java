package com.mobile.susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button viewsegtiga;
    private  Button viewpilih;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi ID
        viewsegtiga = (Button) findViewById(R.id.segitiga);
        viewpilih = (Button)findViewById(R.id.pilih);


        //aksi listener atau intent
        viewsegtiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil class segitiga
                startActivity(new Intent(getApplicationContext(),Segetiga.class));
            }
        });
        //aksi radio
        final RadioGroup rgbjenis = (RadioGroup) findViewById(R.id.rgjenis);
        viewpilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgbjenis.getCheckedRadioButtonId();
                switch (id){
                    case R.id.rbj:
                        Toast.makeText(getApplication(), "saya Suka Java", Toast.LENGTH_SHORT).show();
                        break;
                        case R.id.rbk:
                        Toast.makeText(getApplication(), "saya Suka Kotlin", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.rbf:
                        Toast.makeText(getApplication(), "saya Suka Flutter", Toast.LENGTH_SHORT).show();
                            break;
                }
            }
        });
    }
}