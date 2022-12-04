package com.invoice.dao.impl;

import com.invoice.dao.IUserDao;
import com.invoice.entry.User;
import com.invoice.util.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:34
 */
public class UserDaoImpl implements IUserDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    User user=null;
    @Override
    public User selectUser(String account, String password) {
        try {
            con= DBHelper.getconn();
            String sql="select * from `user` where account=? and password=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,account);
            ps.setString(2,password);
            rs=ps.executeQuery();
            while (rs.next()){
                user=new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEnterpriseid(rs.getInt(3));
                user.setPhone(rs.getString(4));
                user.setAccount(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setIdcardname(rs.getString(7));
                user.setIdcardno(rs.getString(8));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return user;
    }
}
