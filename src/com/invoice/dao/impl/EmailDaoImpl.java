package com.invoice.dao.impl;

import com.invoice.dao.IEmailDao;
import com.invoice.entry.Email;
import com.invoice.util.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 15:31
 */
public class EmailDaoImpl implements IEmailDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int insertEmail(Email email) {
        int num=0;
        try {
            con = DBHelper.getconn();
            String sql = "insert into email(enterprise_id,email_detail,default_status) values(?,?,'普通')";
            ps = con.prepareStatement(sql);
            ps.setInt(1,email.getEnterpriseid());
            ps.setString(2,email.getEmaildetail());
            num = ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return num;
    }

    @Override
    public int updateByid(Email email) {
        return 0;
    }

    @Override
    public List<Email> selectEmail( int enterpriseid) {
        List<Email> list = new ArrayList<>();
        try {
            con = DBHelper.getconn();
            String sql  = "select * from email where enterprise_id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            rs = ps.executeQuery();
            while (rs.next()){
                Email email = new Email();
                email.setId(rs.getInt(1));
                email.setEnterpriseid(rs.getInt(2));
                email.setEmaildetail(rs.getString(3));
                email.setDefaultstatus(rs.getString(4));
                list.add(email);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return list;
    }

    @Override
    public Email selectone(int enterpriseid,String defaultstatus) {
        Email email=null;
        try {
            con = DBHelper.getconn();
            String sql ="select * from email where enterprise_id=? and default_status=?";
            ps =con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            ps.setString(2,defaultstatus);
            rs=ps.executeQuery();
            if(rs.next()){
                email= new Email();
                email.setId(rs.getInt(1));

                email.setEmaildetail(rs.getString(3));

            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return email;
    }
}
