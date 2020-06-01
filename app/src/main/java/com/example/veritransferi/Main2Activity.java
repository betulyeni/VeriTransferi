package com.example.veritransferi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView textViewKullaniciAdi,textViewOgr_no;
    Bilgiler bilgiler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewKullaniciAdi=findViewById(R.id.textViewKullaniciAdi);
        textViewOgr_no=findViewById(R.id.textViewOgr_no);


        bilgiler= (Bilgiler) getIntent().getSerializableExtra("bilgiler");
        textViewKullaniciAdi.setText("Hoşgeldin "+bilgiler.getAdi_soyadi());
        textViewOgr_no.setText(bilgiler.getNumara());

    }
}
