package com.example.testweb.beans;

import java.io.Serializable;

public class giohang implements Serializable {
    private static final long serialVersionUID = 1L;
    String giohang_id;
    int sanpham_id;
    String tensp;
    int giasp;
    String hinhanh,soluong,thanhtien;

    public giohang(String giohang_id, int sanpham_id, String tensp, int giasp, String hinhanh, String soluong, String thanhtien) {
        this.giohang_id = giohang_id;
        this.sanpham_id = sanpham_id;
        this.tensp = tensp;
        this.giasp = giasp;
        this.hinhanh = hinhanh;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getGiohang_id() {
        return giohang_id;
    }

    public void setGiohang_id(String giohang_id) {
        this.giohang_id = giohang_id;
    }

    public int getSanpham_id() {
        return sanpham_id;
    }

    public void setSanpham_id(int sanpham_id) {
        this.sanpham_id = sanpham_id;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getGiasp() {
        return giasp;
    }

    public void setGiasp(int giasp) {
        this.giasp = giasp;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(String thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public String toString() {
        return "giohang{" +
                "giohang_id='" + giohang_id + '\'' +
                ", sanpham_id=" + sanpham_id +
                ", tensp='" + tensp + '\'' +
                ", giasp=" + giasp +
                ", hinhanh='" + hinhanh + '\'' +
                ", soluong='" + soluong + '\'' +
                ", thanhtien='" + thanhtien + '\'' +
                '}';
    }
}
