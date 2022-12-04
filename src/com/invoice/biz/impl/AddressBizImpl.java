package com.invoice.biz.impl;

import com.invoice.biz.IAddressBiz;
import com.invoice.dao.impl.AddressDaoImpl;
import com.invoice.entry.Address;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:37
 */
public class AddressBizImpl implements IAddressBiz {
    AddressDaoImpl adi=new AddressDaoImpl();
    @Override
    public boolean addAddress(Address address) {
        return adi.insertAddress(address)==0?false:true;
    }

    @Override
    public Address queryByEid(int enterpriseid,String defaultstatus) {
        return adi.selectByEid(enterpriseid,defaultstatus);
    }


    @Override
    public boolean modifyAddress(Address address) {
        return false;
    }

    @Override
    public List<Address> queryAddress(int enterpriseid) {
        return adi.selectAddress(enterpriseid);
    }
}
