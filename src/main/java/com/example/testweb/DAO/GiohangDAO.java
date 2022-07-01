package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.giohang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GiohangDAO {
    private static GiohangDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private GiohangDAO() {

    }
    public static GiohangDAO getInstance() {
        if (instance == null) {
            instance = new GiohangDAO();
        }
        return instance;
    }
    public List<giohang> getAll() {
        try {
            List<giohang> list = new ArrayList<>();
            String query = "select * from giohang";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                giohang g = new giohang(rs.getString(1),rs.getInt(2),rs.getString(3),
                        rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(g);

            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // gio hang
    public List<giohang> getByUser(String user) {
        try {
            List<giohang> list = new ArrayList<>();
            String query = "select * from giohang where giohang_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while (rs.next()) {
                giohang g = new giohang(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(g);
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    //sp da mua by user
    public List<giohang> getByUserDaMua(String user) {
        try {
            List<giohang> list = new ArrayList<>();
            String query = "select * from daban where giohang_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while (rs.next()) {
                giohang g = new giohang(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(g);
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<giohang> addByUser(String user) {
        try {

            String query = "select * from giohang where giohang_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<giohang> DelByUser(String user) {
        try {

            String query = "delete from giohang where giohang_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.executeUpdate();


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // update lai san pham sau khi thanh toan
    public List<giohang> UpdateLaiSanPham(String user) {
        try {

            String query = "update sanpham,giohang set sanpham.sanpham_soluong = sanpham.sanpham_soluong - giohang.soluong  WHERE sanpham.sanpham_id = giohang.sanpham_id AND giohang.giohang_id=?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.executeUpdate();


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


// tinh tong tien giohang by user
    public Integer Sum(String user) {
        try {
            int dem = 0;
            String query = "SELECT SUM(thanhtien) total FROM giohang WHERE giohang_id= ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while (rs.next()) {

              dem = rs.getInt(1);
            }
            return dem;


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // lay thong tin so san pham con lai cua ID
    public Integer getSoLuongSP(String ID) {
        try {
            int dem = 0;
            String query = "select (sanpham_soluong) from sanpham where sanpham_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,ID);
            rs = ps.executeQuery();
            while (rs.next()) {

                dem = rs.getInt(1);
            }
            return dem;


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    // tinh tong tien sp da mua by user
    public Integer SumDaMua(String user) {
        try {
            int dem = 0;
            String query = "SELECT SUM(thanhtien) total FROM daban WHERE giohang_id= ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while (rs.next()) {

                dem = rs.getInt(1);
            }
            return dem;


        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public giohang addFromGiohangToDaban(String user) {
        try {
            String query = "INSERT INTO daban (giohang_id,sanpham_id,tensp,giasp,hinhanh,soluong,thanhtien) SELECT giohang_id,sanpham_id,tensp,giasp,hinhanh,soluong,thanhtien FROM giohang WHERE giohang_id = ?";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public giohang addInfoKhachHang(String user,String ten,String sdt,String diachi,String ID,String sanpham,String tong_tien,String trangthai) {
        String query  = "insert into khachhang value (?,?,?,?,?,?,?,?)";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.setString(2,ten);
            ps.setString(3,sdt);
            ps.setString(4,diachi);
            ps.setString(5,ID);
            ps.setString(6,sanpham);
            ps.setString(7,tong_tien);
            ps.setString(8,trangthai);
            ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    // kiem tra san pham co nam trong gio hang hay chua
    public List<giohang> checkSP(String user,int ID) {
        try {
            List<giohang> list = new ArrayList<>();

            String query = "select * from giohang where giohang_id =? and sanpham_id = ?;";
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            ps.setInt(2,ID);
            rs = ps.executeQuery();
            while (rs.next()) {
                giohang g = new giohang(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7));
                list.add(g);
            }
            return list;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void main(String[] args) {
        GiohangDAO g = new GiohangDAO();
        System.out.println(g.getSoLuongSP("1"));
    }
}


