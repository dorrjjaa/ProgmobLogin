package com.utsprogmob.Model;

public class Dosen {
    private String namaDosen;
    private String nidn;
    private String gelar;
    private String emailDosen;
    private String alamatDosen;
    private int fotoDosen;

    public Dosen(String namaDosen, String nidn, String gelar, String emailDosen, String alamatDosen, int fotoDosen) {
        this.namaDosen = namaDosen;
        this.nidn = nidn;
        this.gelar = gelar;
        this.emailDosen = emailDosen;
        this.alamatDosen = alamatDosen;
        this.fotoDosen = fotoDosen;
}
    public String getNamaDosen() {
        return namaDosen;
    }

    public void setNamaDosen(String namaDosen) {
        this.namaDosen = namaDosen;
    }

    public String getNidn() {
        return nidn;
    }

    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getEmailDosen() {
        return emailDosen;
    }

    public void setEmailDosen(String emailDosen) {
        this.emailDosen = emailDosen;
    }

    public String getAlamatDosen() {
        return alamatDosen;
    }

    public void setAlamatDosen(String alamatDosen) {
        this.alamatDosen = alamatDosen;
    }

    public int getFotoDosen() {
        return fotoDosen;
    }

    public void setFotoDosen(int fotoDosen) {
        this.fotoDosen = fotoDosen;
    }
}
