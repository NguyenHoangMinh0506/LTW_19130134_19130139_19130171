package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.Danhmuc;
import com.example.testweb.beans.Product;
import com.example.testweb.beans.ThongTinSP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongTinSPDAO {
    private static ThongTinSPDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private ThongTinSPDAO() {

    }
    public static ThongTinSPDAO getInstance() {
        if (instance == null) {
            instance = new ThongTinSPDAO();
        }
        return instance;

    }
    public ThongTinSP getByDanhMuc(String dm) {
        String query = "Select * from thongtinsp where nha_san_xuat = ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,dm);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new ThongTinSP(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }return null;
    }

    public static void main(String[] args) {
        ThongTinSPDAO t = new ThongTinSPDAO();
        System.out.println(t.getByDanhMuc("1"));
    }
}
