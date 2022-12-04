package com.invoice.dao;

import com.invoice.entry.InvoicingRecord;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 16:21
 */
public interface IInvoicingRecordDao {

    //通过开票记录表查询开票记录
    List<InvoicingRecord> selectInvoicingRecord(InvoicingRecord invoicingRecord);

    //修改处理状态
    int updateInvoicingRecord(InvoicingRecord invoicingRecord);

    //通过id查询抬头信息
    InvoicingRecord selectById(InvoicingRecord invoicingRecord);

    //提交之后在开票记录表里新增对象
    int insertInvoicingRecord(InvoicingRecord invoicingRecord);

    //根据企业id查找发票总金额
    InvoicingRecord selectamountById(int enterpriseid);
}
