package com.poly.myapplication.model;

public class KhoanThuChi {

    public String id;
    public String title;
    public float money;
    public String type; // kieu thu or chi - A : thu , B : chi
    public String date;

    public KhoanThuChi(String id, String title, float money, String type, String date) {
        this.id = id;
        this.title = title;
        this.money = money;
        this.type = type;
        this.date = date;
    }
}
