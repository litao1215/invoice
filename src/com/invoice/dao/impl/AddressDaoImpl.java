package com.invoice.dao.impl;

import com.invoice.dao.IAddressDao;
import com.invoice.entry.Address;
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
 * @DATE: 2022/12/1 13:01
 */
public class AddressDaoImpl implements IAddressDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public int insertAddress(Address address) {
        int num=0;
        try {
            con=DBHelper.getconn();
            String sql="insert into address(enterprise_id,addressee,phone,area,address_detail,default_status) values(?,?,?,?,?,'普通')";
            ps=con.prepareStatement(sql);
            ps.setInt(1,address.getEnterpriseid());
            ps.setString(2,address.getAddressee());
            ps.setString(3,address.getPhone());
            ps.setString(4,address.getArea());
            ps.setString(5,address.getAddressdetail());
            num=ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return num;
    }

    @Override
    public Address selectByEid(int enterpriseid,String defaultstatus) {
        Address address=null;
        try {
            con= DBHelper.getconn();
            String sql="select * from address where enterprise_id=? and default_status=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            ps.setString(2,defaultstatus);
            rs=ps.executeQuery();
            if (rs.next()){
                address=new Address();
                address.setId(rs.getInt(1));
                address.setAddressee(rs.getString(3));
                address.setPhone(rs.getString(4));
                address.setArea(rs.getString(5));
                address.setAddressdetail(rs.getString(6));
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
        return address;
    }

    @Override
    public int updateByid(Address address) {
        int num=0;
        try {
            con= DBHelper.getconn();
            String sql="UPDATE address SET addressee=?,phone=?,area=?,address_detail=? WHERE id=?";
            ps=con.prepareStatement(sql);
            ps.setString(1,address.getAddressee());
            ps.setString(2,address.getPhone());
            ps.setString(3,address.getArea());
            ps.setString(4,address.getAddressdetail());
            ps.setInt(5,address.getId());
            num=ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return num;
    }

    @Override
    public List<Address> selectAddress(int enterpriseid) {
        List<Address> list=new ArrayList<>();
        try {
            con=DBHelper.getconn();
            String sql="select * from address where enterprise_id=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            rs=ps.executeQuery();
            while (rs.next()){
                Address address=new Address();
                address.setId(rs.getInt(1));
                address.setEnterpriseid(rs.getInt(2));
                address.setAddressee(rs.getString(3));
                address.setPhone(rs.getString(4));
                address.setArea(rs.getString(5));
                address.setAddressdetail(rs.getString(6));
                address.setDefaultstatus(rs.getString(7));
                list.add(address);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
