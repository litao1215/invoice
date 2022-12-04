package com.invoice.biz.impl;

import com.invoice.biz.IOrderBiz;
import com.invoice.dao.impl.OrderDaoImpl;
import com.invoice.entry.Order;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:35
 */
public class OrderBizImpl implements IOrderBiz {
    OrderDaoImpl odi=new OrderDaoImpl();

    @Override
    public List<Order> queryOrder(Order order) {
        return null;
    }

    @Override
    public boolean modifyOrder(Order order) {
        return false;
    }

    @Override
    public Order queryamountById(Order order) {
        return odi.selectorderById(order.getEnterpriseid());
    }

    @Override
    public Order queryamountById1(Order order) {
        return odi.selectorderById(order.getEnterpriseid());
    }
}
