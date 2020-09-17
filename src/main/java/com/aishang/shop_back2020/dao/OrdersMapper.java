package com.aishang.shop_back2020.dao;

import com.aishang.shop_back2020.po.Orders;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.MyMapper;

import java.util.List;

@Mapper
public interface OrdersMapper extends MyMapper<Orders> {
    List<Orders> getAll();

}