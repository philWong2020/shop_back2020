package com.aishang.shop_back2020.service;

import com.aishang.shop_back2020.po.Orders;

import java.util.List;

public interface OrderService {
    /**
     * 获取Orders表的所有数据
     * @return
     */
    List<Orders> getAll();

}
