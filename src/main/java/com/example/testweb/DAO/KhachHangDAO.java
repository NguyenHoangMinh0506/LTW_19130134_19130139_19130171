package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.KhachHang;
import com.example.testweb.beans.giohang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KhachHangDAO {
    private static KhachHangDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private KhachHangDAO() {

    }
    public static KhachHangDAO getInstance() {
        if (instance == null) {
            instance = new KhachHangDAO();
        }
        return instance;
    }
    // lay toan bo danh sach don hang
    public List<KhachHang> getAll() {
        try {
            List<KhachHang> list = new ArrayList<>();
            String query = "select * from khachhang";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHang k = new KhachHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));


                list.add(k);
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // lay don hang theo user
    public List<KhachHang> getByUser(String user) {
        try {
            List<KhachHang> list = new ArrayList<>();
            String query = "select * from khachhang where user = ? ";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();

            while (rs.next()) {
                KhachHang k = new KhachHang(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));


                list.add(k);
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        KhachHangDAO k = new KhachHangDAO();
        System.out.println(k.getByUser("minhpro00001"));
    }

}
