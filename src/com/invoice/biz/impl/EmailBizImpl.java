package com.invoice.biz.impl;

import com.invoice.biz.IEmailBiz;
import com.invoice.dao.impl.EmailDaoImpl;
import com.invoice.entry.Email;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:37
 */
public class EmailBizImpl implements IEmailBiz {
    EmailDaoImpl ebi=new EmailDaoImpl();
    @Override
    public boolean addEmail(Email email) {
        return ebi.insertEmail(email)==0?false:true;
    }

    @Override
    public boolean modifyEmail(Email email) {
        return ebi.updateByid(email)==0?false:true;
    }

    @Override
    public Email queryByEid(int enterpriseid, String defaultstatus) {
        return ebi.selectone(enterpriseid,defaultstatus);
    }

    @Override
    public List<Email> queryEmail(int enterpriseid) {
        return ebi.selectEmail(enterpriseid);
    }



}
