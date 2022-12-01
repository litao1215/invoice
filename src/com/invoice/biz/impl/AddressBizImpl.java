package com.invoice.biz.impl;

import com.invoice.biz.IAddressBiz;
import com.invoice.entry.Address;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:37
 */
public class AddressBizImpl implements IAddressBiz {
    @Override
    public boolean addAddress(Address address) {
        return false;
    }

    @Override
    public boolean modifyAddress(Address address) {
        return false;
    }

    @Override
    public List<Address> queryAddress(Address address) {
        return null;
    }
}
