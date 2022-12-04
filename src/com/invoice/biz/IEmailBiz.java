package com.invoice.biz;

import com.invoice.entry.Email;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:34
 */
public interface IEmailBiz {

    //判断是否新增成功
    boolean addEmail(Email email);

    //判断是否修改成功
    boolean modifyEmail(Email email);

    //通过企业id得到电子邮箱
    List<Email> queryEmail(int enterpriseid);

    //通过企业id查找一个对象
    Email queryByEid(int enterpriseid,String defaultstatus);
}
