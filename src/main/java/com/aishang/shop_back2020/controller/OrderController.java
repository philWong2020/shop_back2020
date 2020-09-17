package com.aishang.shop_back2020.controller;

import com.aishang.shop_back2020.po.Orders;
import com.aishang.shop_back2020.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/order")
@RestController
public class OrderController {
    @Resource
    private OrderService orderService;

    @RequestMapping("/getAll")
    public List<Orders> getAll(){



        return orderService.getAll();
    }
}
