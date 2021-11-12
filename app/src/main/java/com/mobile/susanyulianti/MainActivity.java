package com.mobile.susanyulianti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button viewsegtiga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi ID
        viewsegtiga = (Button) findViewById(R.id.segitiga);


        //aksi listener atau intent
        viewsegtiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //memanggil class segitiga
                startActivity(new Intent(getApplicationContext(),Segetiga.class));
            }
        });
    }
}