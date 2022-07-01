package com.example.testweb.DAO;

import com.example.testweb.DBConnect;
import com.example.testweb.Mail.Mail;
import com.example.testweb.beans.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AccountDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private static AccountDAO instance;
    private AccountDAO() {
    }

    public static AccountDAO getInstance() {
        if (instance == null) {
            instance = new AccountDAO();
        }
        return instance;
    }

    public Account login(String user, String pass){
        String query ="select * from member where username = ? and password = ?";
        try{
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);

            ps.setString(2,pass);

            rs = ps.executeQuery();
            while (rs.next()){
                return new Account(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

            }
        }catch (Exception e){

        }
        return null;
    }
    public Account checkAccountExist(String user){
        String query ="select * from member where username = ?";
        try{
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,user);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Account(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

            }
        }catch (Exception e){

        }
        return null;
    }

    public void register(String user, String pass, String email,String fullname) {
        String query = "insert into member values (?,?,?,?)";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, email);
            ps.setString(4 , fullname);

            ps.executeUpdate();
            while (rs.next()) {

            }
        } catch (Exception e) {

        }
    }

    public boolean ForgotPass(String user, String email) {
        String query = "select * from member where username = ? and email = ?";

        String a = null;
        try {

            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, email);
            rs = ps.executeQuery();
            while (rs.next()) {
                a = rs.getString(2);

            }
        } catch (Exception e) {

        }
        return Mail.send(email, "Mật khẩu của bạn là: "+a);
    }

    public static void main(String[] args) {
        AccountDAO l = new AccountDAO();

        System.out.println(l.ForgotPass("anhtu123","hoangminh88881@gmail.com"));
    }
}
