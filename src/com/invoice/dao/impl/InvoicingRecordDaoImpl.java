package com.invoice.dao.impl;

import com.invoice.dao.IInvoicingRecordDao;
import com.invoice.entry.InvoicingRecord;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 16:27
 */
public class InvoicingRecordDaoImpl implements IInvoicingRecordDao {
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
}
