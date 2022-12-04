package com.invoice.dao;

import com.invoice.entry.Address;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:55
 */
public interface IAddressDao {

    //通过点击新增向数据库中的邮件地址表插入数据
    int insertAddress(Address address);

        //通过企业ID查询对象
    Address selectByEid(int enterpriseid,String defaultstatus);

    //通过邮寄地址表的id去修改默认值
    int updateByid(Address address);

    //通过企业id得到详细地址
    List<Address> selectAddress(int enterpriseid);

}
