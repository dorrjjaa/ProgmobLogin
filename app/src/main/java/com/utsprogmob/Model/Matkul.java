package com.utsprogmob.Model;

public class Matkul {
    private String kodeMatkul;
    private String namaMatkul;
    private String hari;
    private String sks;
    private String sesi;

    public Matkul(String kodeMatkul, String namaMatkul, String hari, String sks, String sesi) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.hari = hari;
        this.sks = sks;
        this.sesi = sesi;
}
    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public void setKodeMatkul(String kodeMatkul) {
        this.kodeMatkul = kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getSks() {
        return sks;
    }

    public void setSks(String sks) {
        this.sks = sks;
    }

    public String getSesi() {
        return sesi;
    }

    public void setSesi(String sesi) {
        this.sesi = sesi;
    }
}
