package com.invoice.dao.impl;

import com.invoice.dao.IBaseDataDao;
import com.invoice.entry.*;
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
 * @DATE: 2022/12/1 12:47
 */
public class BaseDataDaoImpl implements IBaseDataDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public BaseData selectOne(BaseData baseData) {

        BaseData baseData1=null;
        try {
            con=DBHelper.getconn();
            String sql="select * from base_date where enterprise_id=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,baseData.getEnterpriseid());
            rs=ps.executeQuery();
            if (rs.next()){
                baseData1=new BaseData();
                baseData1.setId(rs.getInt(1));
                baseData1.setEnterpriseid(rs.getInt(2));
                baseData1.setTitle(rs.getString(3));
                baseData1.setTaxno(rs.getString(4));
                baseData1.setBankname(rs.getString(5));
                baseData1.setBankaccount(rs.getString(6));
                baseData1.setPhone(rs.getString(7));
                baseData1.setAddress(rs.getString(8));
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
        return baseData1;
    }

    @Override
    public Total selectByEpId(int enterpriseid) {
        Total total=null;
        try {
            con = DBHelper.getconn();
            String sql = "SELECT b.title,b.tax_no,a.address_detail,e.email_detail from base_date b,address a,email e where b.enterprise_id=? and a.enterprise_id=? and e.enterprise_id=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            ps.setInt(2,enterpriseid);
            ps.setInt(3,enterpriseid);
            rs=ps.executeQuery();
            if (rs.next()){
                total=new Total();
                total.setTitle(rs.getString("title"));
                total.setTaxno(rs.getString("tax_no"));
                total.setAddressdetail(rs.getString("address_detail"));
                total.setEmaildetail(rs.getString("email_detail"));
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
        return total;
    }

    @Override
    public int updateBaseDate(BaseData baseData) {
        int i=0;
        try {
            con = DBHelper.getconn();
            String sql="update base_date set bank_name=?,bank_account=?,phone=?,address=? where id=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,baseData.getBankname());
            ps.setString(2,baseData.getBankaccount());
            ps.setString(3,baseData.getPhone());
            ps.setString(4,baseData.getAddress());
            ps.setInt(5,baseData.getId());
            i=ps.executeUpdate();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBHelper.closeAll(rs,ps,con);
        }
        return i;
    }
}
