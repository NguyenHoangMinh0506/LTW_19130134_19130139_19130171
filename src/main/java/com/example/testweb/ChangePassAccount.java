package com.example.testweb;

import com.example.testweb.beans.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ChangePassAccount {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    private static ChangePassAccount instance;
    private ChangePassAccount() {
    }

    public static ChangePassAccount getInstance() {
        if (instance == null) {
            instance = new ChangePassAccount();
        }
        return instance;
    }
    // check email and pass cua user
    public Account checkAccount(String password, String user) {
        String query ="select * from member where password = ? and username = ?";
        try{
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1,password);
            ps.setString(2,user);
            rs = ps.executeQuery();
            while (rs.next()){
                return new Account(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));

            }
        }catch (Exception e){

        }
        return null;
    }
    // doi password user
    public Account changePass(String newPass, String user) {
        String query = "update member set password = ? where username = ?";
        try {
            conn = DBConnect.connect().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, newPass);
            ps.setString(2, user);

            ps.executeUpdate();

        } catch (Exception e) {

        }
        return null;
    }

    public static void main(String[] args) {
        ChangePassAccount c = new ChangePassAccount();
        c.changePass("hahaha","minhpro00002");

    }


}
