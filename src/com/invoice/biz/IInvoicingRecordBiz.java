package com.invoice.biz;

import com.invoice.entry.InvoicingRecord;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:33
 */
public interface IInvoicingRecordBiz {

    //通过开票记录表查询开票记录
    List<InvoicingRecord> selectInvoicingRecord(InvoicingRecord invoicingRecord);

    //查询处理状态是否修改成功
    boolean modifyInvoicingRecord(InvoicingRecord invoicingRecord);

    //通过id查询抬头信息
    InvoicingRecord queryById(InvoicingRecord invoicingRecord);

    //查询在开票记录表里新增是否成功
    boolean addInvoicingRecord(InvoicingRecord invoicingRecord);
}
