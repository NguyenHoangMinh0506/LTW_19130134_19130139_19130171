package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.giohang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MuaSPDAO {
    private static MuaSPDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    private MuaSPDAO() {

    }
    public static MuaSPDAO getInstance() {
        if (instance == null) {
            instance = new MuaSPDAO();
        }
        return instance;
    }
    public giohang addItem(String giohang_id, int sanpham_id, String tensp, int giasp, String hinhanh, String soluong, String thanhtien) {
        String query = "insert into giohang value (?,?,?,?,?,?,?)";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,giohang_id);
            ps.setInt(2,sanpham_id);
            ps.setString(3,tensp);
            ps.setInt(4,giasp);
            ps.setString(5,hinhanh);
            ps.setString(6,soluong);
            ps.setString(7,thanhtien);
            ps.executeUpdate();



        }catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public giohang delItem(String giohang_id, int sanpham_id) {
        String query = "delete from giohang where giohang_id = ? and sanpham_id = ? ";
        try{
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,giohang_id);
            ps.setInt(2,sanpham_id);
            ps.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public giohang updateItem(String giohang_id, String soluong,int id) {
        String query = "update giohang set soluong = ?, thanhtien = ? * giasp where giohang_id =? and sanpham_id = ?";
        try{
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(3,giohang_id);
            ps.setString(1, soluong);
            ps.setString(2,soluong);
            ps.setInt(4,id);

            ps.executeUpdate();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        MuaSPDAO m = new MuaSPDAO();
       m.updateItem("admin","3",41);
    }
}
