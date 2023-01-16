package com.dto;

import com.entity.OrderDetail;
import com.entity.Orders;
import lombok.Data;

import java.util.List;
@Data
public class OrderDto extends Orders {
    private List<OrderDetail> orderDetails;
}
