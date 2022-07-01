package com.example.testweb.beans;

import java.io.Serializable;

public class KhachHang implements Serializable {
    private static final long serialVersionUID = 1L;
    String user,ten,sdt,diachi,ID_donhang,san_pham,tong_tien,trang_thai;

    public KhachHang(String user, String ten, String sdt, String diachi, String ID_donhang, String san_pham, String tong_tien, String trang_thai) {
        this.user = user;
        this.ten = ten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.ID_donhang = ID_donhang;
        this.san_pham = san_pham;
        this.tong_tien = tong_tien;
        this.trang_thai = trang_thai;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getID_donhang() {
        return ID_donhang;
    }

    public void setID_donhang(String ID_donhang) {
        this.ID_donhang = ID_donhang;
    }

    public String getSan_pham() {
        return san_pham;
    }

    public void setSan_pham(String san_pham) {
        this.san_pham = san_pham;
    }

    public String getTong_tien() {
        return tong_tien;
    }

    public void setTong_tien(String tong_tien) {
        this.tong_tien = tong_tien;
    }

    public String getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(String trang_thai) {
        this.trang_thai = trang_thai;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "user='" + user + '\'' +
                ", ten='" + ten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diachi='" + diachi + '\'' +
                ", ID_donhang='" + ID_donhang + '\'' +
                ", san_pham='" + san_pham + '\'' +
                ", tong_tien='" + tong_tien + '\'' +
                ", trang_thai='" + trang_thai + '\'' +
                '}';
    }
}
