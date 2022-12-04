package com.invoice.dao.impl;

import com.invoice.dao.IInvoicingRecordDao;
import com.invoice.entry.InvoicingRecord;
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
 * @DATE: 2022/12/1 16:27
 */
public class InvoicingRecordDaoImpl implements IInvoicingRecordDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public List<InvoicingRecord> selectInvoicingRecord(InvoicingRecord invoicingRecord) {
        return null;
    }

    @Override
    public int updateInvoicingRecord(InvoicingRecord invoicingRecord) {
        return 0;
    }

    @Override
    public InvoicingRecord selectById(InvoicingRecord invoicingRecord) {
        return null;
    }

    @Override
    public int insertInvoicingRecord(InvoicingRecord invoicingRecord) {
        return 0;
    }

    @Override
    public InvoicingRecord selectamountById(int enterpriseid) {
        InvoicingRecord ir=null;
        try {
            con= DBHelper.getconn();
            String sql="select sum(amount) from invoicing_record where enterprise_id=?";
            ps=con.prepareStatement(sql);
            ps.setInt(1,enterpriseid);
            rs=ps.executeQuery();
            if (rs.next()){
                ir=new InvoicingRecord();
                ir.setAmount(rs.getDouble(1));
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
        return ir;
    }
}
