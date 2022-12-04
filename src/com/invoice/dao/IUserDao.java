package com.invoice.dao;

import com.invoice.entry.User;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:28
 */
public interface IUserDao {

    //通过账号和密码查询数据库
    User selectUser(String account,String password);

}
