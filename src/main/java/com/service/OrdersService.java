package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.OrderDetail;
import com.entity.Orders;

import java.util.List;

public interface OrdersService extends IService<Orders> {
    /**
     * 用户下单
     */
    public void  submit(Orders orders);

    /**
     * 根据订单id条件查询订单明细表里的数据
     * @param orderId
     * @return
     */
    public List<OrderDetail> getOrderDetailListByOrderId(Long orderId);
}
