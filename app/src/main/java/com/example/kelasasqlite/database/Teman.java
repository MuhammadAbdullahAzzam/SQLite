package com.example.kelasasqlite.database;

public class Teman {
    String id,nama,telp;

    public Teman(String id,String nama,String telp){
        this.id = id;
        this.nama = nama;
        this.telp = telp;
    }

    public Teman() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }
}