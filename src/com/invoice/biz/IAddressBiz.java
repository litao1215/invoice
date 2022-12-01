package com.invoice.biz;

import com.invoice.entry.Address;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:34
 */
public interface IAddressBiz {

    //判断是否新增成功
    boolean addAddress(Address address);

    //判断是否修改成功
    boolean modifyAddress(Address address);

    //通过企业id得到详细地址
    List<Address> queryAddress(Address address);
}
