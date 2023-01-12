package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.entity.Orders;

public interface OrdersService extends IService<Orders> {
    /**
     * 用户下单
     */
    public void  submit(Orders orders);
}
