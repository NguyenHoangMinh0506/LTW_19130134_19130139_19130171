package com.example.testweb.beans;

import java.io.Serializable;

public class Danhmuc implements Serializable {
    private static final long serialVersionUID = 1L;
    String stt_nha_san_xuat,nha_san_xuat;

    public Danhmuc(String stt_nha_san_xuat, String nha_san_xuat) {

        this.stt_nha_san_xuat = stt_nha_san_xuat;
        this.nha_san_xuat = nha_san_xuat;
    }

    public String getStt_nha_san_xuat() {
        return stt_nha_san_xuat;
    }

    public void setStt_nha_san_xuat(String stt_nha_san_xuat) {
        this.stt_nha_san_xuat = stt_nha_san_xuat;
    }

    public String getNha_san_xuat() {
        return nha_san_xuat;
    }

    public void setNha_san_xuat(String nha_san_xuat) {
        this.nha_san_xuat = nha_san_xuat;
    }

    @Override
    public String toString() {
        return "Danhmuc{" +
                "stt_nha_san_xuat='" + stt_nha_san_xuat + '\'' +
                ", nha_san_xuat='" + nha_san_xuat + '\'' +
                '}';
    }
}
