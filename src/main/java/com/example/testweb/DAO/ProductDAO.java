package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.beans.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private static ProductDAO instance;

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private ProductDAO() {
    }

    public static ProductDAO getInstance() {
        if (instance == null) {
            instance = new ProductDAO();
        }
        return instance;
    }
    public List<Product> getAll() {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getAllHot() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_active = '0' ORDER BY sanpham_id DESC";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getAllActive() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_hot ='0' ORDER BY sanpham_id DESC";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getAllGaming() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE danhmuc_id ='1' ORDER BY sanpham_id DESC";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getAllWired() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE danhmuc_id ='2' ORDER BY sanpham_id DESC";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getAllWireless() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE danhmuc_id ='3' ORDER BY sanpham_id DESC";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getFill1() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_giakm < 200000";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getFill2() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_giakm between 200000 and 500000";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> getFill3() {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_giakm > 500000";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> Search(String search) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_name like ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,'%'+search+'%');
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public Product getById(String id) {
        String query = "Select *from sanpham where sanpham_id = ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,id);

            rs = ps.executeQuery();
         while (rs.next()) {
             return new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                     rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                     rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13));
         }

        }catch (Exception e) {
            e.printStackTrace();
        }return null;
    }
    public List<Product> PageFill1(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where sanpham_giakm <200000 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageFill2(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where sanpham_giakm between 200000 and 500000 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageFill3(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where sanpham_giakm > 500000 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageFill4(String search,int page) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * from sanpham WHERE sanpham_name like ? limit 6 offset ?";

        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,'%'+search+'%');
            ps.setInt(2,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageGaming(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where danhmuc_id = 1 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageKhongDay(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where danhmuc_id = 2 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
    public List<Product> PageCoDay(int page) {
        List<Product> list = new ArrayList<>();
        String query = "select * from sanpham where danhmuc_id = 3 limit 6 offset ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,page*6-6);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }



    public static void main(String[] args) {
        ProductDAO p = new ProductDAO();
        System.out.println(p.PageGaming(1));




    }


}
