package com.invoice.biz.impl;

import com.invoice.biz.IInvoicingRecordBiz;
import com.invoice.dao.impl.InvoicingRecordDaoImpl;
import com.invoice.entry.InvoicingRecord;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:36
 */
public class InvoicingRecordBizImpl implements IInvoicingRecordBiz {
    InvoicingRecordDaoImpl irdi=new InvoicingRecordDaoImpl();

    @Override
    public List<InvoicingRecord> selectInvoicingRecord(InvoicingRecord invoicingRecord) {
        return null;
    }

    @Override
    public boolean modifyInvoicingRecord(InvoicingRecord invoicingRecord) {
        return false;
    }

    @Override
    public InvoicingRecord queryById(InvoicingRecord invoicingRecord) {
        return null;
    }

    @Override
    public boolean addInvoicingRecord(InvoicingRecord invoicingRecord) {
        return false;
    }

    @Override
    public InvoicingRecord queryamountById(InvoicingRecord invoicingRecord) {
        return irdi.selectamountById(invoicingRecord.getEnterpriseid());
    }
}
