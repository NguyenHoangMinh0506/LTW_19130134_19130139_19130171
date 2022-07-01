package com.example.testweb.beans;

public class Product {
    int sanpham_id,danhmuc_id;
    String sanpham_name,sanpham_gia,sanpham_giakm,sanpham_active,sanpham_hot,sanpham_soluong,sanpham_image,sanpham_inf1,sanpham_inf2,sanpham_inf3,sanpham_inf4;

    public Product(int sanpham_id, int danhmuc_id, String sanpham_name, String sanpham_gia, String sanpham_giakm, String sanpham_active, String sanpham_hot, String sanpham_soluong, String sanpham_image, String sanpham_inf1, String sanpham_inf2, String sanpham_inf3, String sanpham_inf4) {
        this.sanpham_id = sanpham_id;
        this.danhmuc_id = danhmuc_id;
        this.sanpham_name = sanpham_name;
        this.sanpham_gia = sanpham_gia;
        this.sanpham_giakm = sanpham_giakm;
        this.sanpham_active = sanpham_active;
        this.sanpham_hot = sanpham_hot;
        this.sanpham_soluong = sanpham_soluong;
        this.sanpham_image = sanpham_image;
        this.sanpham_inf1 = sanpham_inf1;
        this.sanpham_inf2 = sanpham_inf2;
        this.sanpham_inf3 = sanpham_inf3;
        this.sanpham_inf4 = sanpham_inf4;
    }

    public int getSanpham_id() {
        return sanpham_id;
    }

    public void setSanpham_id(int sanpham_id) {
        this.sanpham_id = sanpham_id;
    }

    public int getDanhmuc_id() {
        return danhmuc_id;
    }

    public void setDanhmuc_id(int danhmuc_id) {
        this.danhmuc_id = danhmuc_id;
    }

    public String getSanpham_name() {
        return sanpham_name;
    }

    public void setSanpham_name(String sanpham_name) {
        this.sanpham_name = sanpham_name;
    }

    public String getSanpham_gia() {
        return sanpham_gia;
    }

    public void setSanpham_gia(String sanpham_gia) {
        this.sanpham_gia = sanpham_gia;
    }

    public String getSanpham_giakm() {
        return sanpham_giakm;
    }

    public void setSanpham_giakm(String sanpham_giakm) {
        this.sanpham_giakm = sanpham_giakm;
    }

    public String getSanpham_active() {
        return sanpham_active;
    }

    public void setSanpham_active(String sanpham_active) {
        this.sanpham_active = sanpham_active;
    }

    public String getSanpham_hot() {
        return sanpham_hot;
    }

    public void setSanpham_hot(String sanpham_hot) {
        this.sanpham_hot = sanpham_hot;
    }

    public String getSanpham_soluong() {
        return sanpham_soluong;
    }

    public void setSanpham_soluong(String sanpham_soluong) {
        this.sanpham_soluong = sanpham_soluong;
    }

    public String getSanpham_image() {
        return sanpham_image;
    }

    public void setSanpham_image(String sanpham_image) {
        this.sanpham_image = sanpham_image;
    }

    public String getSanpham_inf1() {
        return sanpham_inf1;
    }

    public void setSanpham_inf1(String sanpham_inf1) {
        this.sanpham_inf1 = sanpham_inf1;
    }

    public String getSanpham_inf2() {
        return sanpham_inf2;
    }

    public void setSanpham_inf2(String sanpham_inf2) {
        this.sanpham_inf2 = sanpham_inf2;
    }

    public String getSanpham_inf3() {
        return sanpham_inf3;
    }

    public void setSanpham_inf3(String sanpham_inf3) {
        this.sanpham_inf3 = sanpham_inf3;
    }

    public String getSanpham_inf4() {
        return sanpham_inf4;
    }

    public void setSanpham_inf4(String sanpham_inf4) {
        this.sanpham_inf4 = sanpham_inf4;
    }

    @Override
    public String toString() {
        return "Product{" +
                "sanpham_id=" + sanpham_id +
                ", danhmuc_id=" + danhmuc_id +
                ", sanpham_name='" + sanpham_name + '\'' +
                ", sanpham_gia='" + sanpham_gia + '\'' +
                ", sanpham_giakm='" + sanpham_giakm + '\'' +
                ", sanpham_active='" + sanpham_active + '\'' +
                ", sanpham_hot='" + sanpham_hot + '\'' +
                ", sanpham_soluong='" + sanpham_soluong + '\'' +
                ", sanpham_image='" + sanpham_image + '\'' +
                ", sanpham_inf1='" + sanpham_inf1 + '\'' +
                ", sanpham_inf2='" + sanpham_inf2 + '\'' +
                ", sanpham_inf3='" + sanpham_inf3 + '\'' +
                ", sanpham_inf4='" + sanpham_inf4 + '\'' +
                '}';
    }
}

