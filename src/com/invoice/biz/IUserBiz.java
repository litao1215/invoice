package com.invoice.biz;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:33
 */
public interface IUserBiz {

    //判断登录是否成功
    Boolean queryUser(String account, String password);

}
