package com.example.testweb.beans;

import java.io.Serializable;

public class ThongTinSP implements Serializable {
    private static final long serialVersionUID = 1L;
    String nha_san_xuat,tuong_thich,do_phan_giai,ket_noi,do_dai,trong_luong,den_led,thuong_hieu,san_xuat;

    public ThongTinSP(String nha_san_xuat, String tuong_thich, String do_phan_giai, String ket_noi, String do_dai, String trong_luong, String den_led, String thuong_hieu, String san_xuat) {
        this.nha_san_xuat = nha_san_xuat;
        this.tuong_thich = tuong_thich;
        this.do_phan_giai = do_phan_giai;
        this.ket_noi = ket_noi;
        this.do_dai = do_dai;
        this.trong_luong = trong_luong;
        this.den_led = den_led;
        this.thuong_hieu = thuong_hieu;
        this.san_xuat = san_xuat;
    }

    public String getNha_san_xuat() {
        return nha_san_xuat;
    }

    public void setNha_san_xuat(String nha_san_xuat) {
        this.nha_san_xuat = nha_san_xuat;
    }

    public String getTuong_thich() {
        return tuong_thich;
    }

    public void setTuong_thich(String tuong_thich) {
        this.tuong_thich = tuong_thich;
    }

    public String getDo_phan_giai() {
        return do_phan_giai;
    }

    public void setDo_phan_giai(String do_phan_giai) {
        this.do_phan_giai = do_phan_giai;
    }

    public String getKet_noi() {
        return ket_noi;
    }

    public void setKet_noi(String ket_noi) {
        this.ket_noi = ket_noi;
    }

    public String getDo_dai() {
        return do_dai;
    }

    public void setDo_dai(String do_dai) {
        this.do_dai = do_dai;
    }

    public String getTrong_luong() {
        return trong_luong;
    }

    public void setTrong_luong(String trong_luong) {
        this.trong_luong = trong_luong;
    }

    public String getDen_led() {
        return den_led;
    }

    public void setDen_led(String den_led) {
        this.den_led = den_led;
    }

    public String getThuong_hieu() {
        return thuong_hieu;
    }

    public void setThuong_hieu(String thuong_hieu) {
        this.thuong_hieu = thuong_hieu;
    }

    public String getSan_xuat() {
        return san_xuat;
    }

    public void setSan_xuat(String san_xuat) {
        this.san_xuat = san_xuat;
    }

    @Override
    public String toString() {
        return "ThongTinSP{" +
                "nha_san_xuat='" + nha_san_xuat + '\'' +
                ", tuong_thich='" + tuong_thich + '\'' +
                ", do_phan_giai='" + do_phan_giai + '\'' +
                ", ket_noi='" + ket_noi + '\'' +
                ", do_dai='" + do_dai + '\'' +
                ", trong_luong='" + trong_luong + '\'' +
                ", den_led='" + den_led + '\'' +
                ", thuong_hieu='" + thuong_hieu + '\'' +
                ", san_xuat='" + san_xuat + '\'' +
                '}';
    }
}
