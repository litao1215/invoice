package com.invoice.dao.impl;

import com.invoice.dao.IOrderDao;
import com.invoice.entry.Order;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:42
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public List<Order> selectOrder(Order order) {
        return null;
    }

    @Override
    public int updateOrder(Order order) {
        return 0;
    }
}
