package com.invoice.biz;

import com.invoice.entry.Order;

import java.util.List;

/**
 * @PROJECT_NAME: invoice
 * @DESCRIPTION:
 * @USER: ASUS
 * @DATE: 2022/12/1 11:33
 */
public interface IOrderBiz {

    //通过订单表查询订单信息
    List<Order> queryOrder(Order order);

    //查询开票状态是否改变
    boolean modifyOrder(Order order);
}
