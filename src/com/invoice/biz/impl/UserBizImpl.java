package com.invoice.biz.impl;

import com.invoice.biz.IUserBiz;
import com.invoice.dao.impl.UserDaoImpl;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:35
 */
public class UserBizImpl implements IUserBiz {
    UserDaoImpl udi=new UserDaoImpl();
    @Override
    public Boolean queryUser(String account, String password) {
        return udi.selectUser(account,password)==null?false:true;
    }
}
