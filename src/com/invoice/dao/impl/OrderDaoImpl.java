package com.invoice.dao.impl;

import com.invoice.dao.IOrderDao;
import com.invoice.entry.Order;
import com.invoice.util.DBHelper;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:42
 */
public class OrderDaoImpl implements IOrderDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<Order> selectOrder(Order order) {
        return null;
    }

    @Override
    public int updateOrder(Order order) {
        return 0;
    }

    @Override
    public Order selectorderById(int enterpriseid) {
        Order order=null;
        try {
            con= DBHelper.getconn();
            String sql="select * from `order` where enterprise_id=? and invoicing_status='已开票'";
            ps=con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            rs=ps.executeQuery();
            if (rs.next()){
                order=new Order();
                order.setTotalamount(rs.getDouble(3));
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
        return order;
    }

    @Override
    public Order selectorderById1(int enterpriseid) {
        Order order=null;
        try {
            con= DBHelper.getconn();
            String sql="select * from `order` where enterprise_id=? and invoicing_status='未开票'";
            ps=con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            rs=ps.executeQuery();
            if (rs.next()){
                order=new Order();
                order.setTotalamount(rs.getDouble(3));
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
        return order;
    }
}
