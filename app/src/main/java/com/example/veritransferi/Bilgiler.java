package com.example.veritransferi;

import java.io.Serializable;

public class Bilgiler implements Serializable {
    String adi_soyadi;
    String numara;
    String sifre;

    public Bilgiler(String adi_soyadi, String numara, String sifre) {
        this.adi_soyadi = adi_soyadi;
        this.numara = numara;
        this.sifre = sifre;
    }

    public String getAdi_soyadi() {
        return adi_soyadi;
    }

    public void setAdi_soyadi(String adi_soyadi) {
        this.adi_soyadi = adi_soyadi;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
