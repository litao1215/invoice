package com.invoice.biz.impl;

import com.invoice.biz.IEmailBiz;
import com.invoice.entry.Email;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:37
 */
public class EmailBizImpl implements IEmailBiz {
    @Override
    public boolean addEmail(Email email) {
        return false;
    }

    @Override
    public boolean modifyEmail(Email email) {
        return false;
    }

    @Override
    public List<Email> queryEmail(Email email) {
        return null;
    }
}
