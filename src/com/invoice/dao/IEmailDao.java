package com.invoice.dao;

import com.invoice.entry.Email;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 15:30
 */
public interface IEmailDao {

    //通过点击新增向数据库中的电子邮箱表插入数据
    int insertEmail(Email email);

    //通过电子邮箱表的id去修改默认值
    int updateByid(Email email);

    //通过企业id得到电子邮箱
    List<Email> selectEmail(int enterpriseid);

    //通过企业ID得到电子邮箱
    Email selectone(int enterpriseid,String defaultstatus);
}
