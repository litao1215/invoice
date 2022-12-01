package com.invoice.dao;

import com.invoice.entry.Order;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 12:37
 */
public interface IOrderDao {

    //通过订单表查询订单信息
    List<Order> selectOrder(Order order);

    //修改开票状态
    int updateOrder(Order order);
}
