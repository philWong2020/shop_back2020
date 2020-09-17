package com.aishang.shop_back2020.service.impl;

import com.aishang.shop_back2020.dao.OrdersMapper;
import com.aishang.shop_back2020.po.Orders;
import com.aishang.shop_back2020.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrdersMapper ordersMapper;
    @Override
    public List<Orders> getAll() {
        return ordersMapper.getAll();
    }
}
