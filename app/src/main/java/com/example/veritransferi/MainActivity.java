package com.example.veritransferi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ogrenci_no,sifre,ad_soyad;
    Button giris;
    Bilgiler bilgiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ogrenci_no=findViewById(R.id.ogrenci_no);
        sifre=findViewById(R.id.sifre);
        ad_soyad= findViewById(R.id.ogrenci_adisoyadi);

        giris=findViewById(R.id.giris);

        giris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kullanici_ad=ad_soyad.getText().toString();
                String numara=ogrenci_no.getText().toString();
                String kullanici_sifre=sifre.getText().toString();


                Intent gecis=new Intent(MainActivity.this,Main2Activity.class);
                bilgiler=new Bilgiler(kullanici_ad,numara,kullanici_sifre);
                gecis.putExtra("bilgiler",bilgiler);
                startActivity(gecis);
            }
        });


    }
}
