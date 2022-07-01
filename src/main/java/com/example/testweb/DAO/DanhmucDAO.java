package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.Danhmuc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DanhmucDAO {
    private static DanhmucDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private DanhmucDAO() {

    }
    public static DanhmucDAO getInstance() {
        if (instance == null) {
            instance = new DanhmucDAO();
        }
        return instance;
    }
    public List<Danhmuc> getAll() {

        try {
            List<Danhmuc> list = new ArrayList<>();
            String query = "select * from nha_san_xuat";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
               Danhmuc d = new Danhmuc(rs.getString(1), rs.getString(2) );
               list.add(d);

            }
            return list;

        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static void main(String[] args) {

    DanhmucDAO d = new DanhmucDAO();
    d.getAll();
    }
}
