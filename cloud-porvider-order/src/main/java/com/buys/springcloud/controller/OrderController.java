package com.buys.springcloud.controller;

import com.buys.springcloud.entity.Order;
import com.buys.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * wzy----15:27 2020/8/1 15:27
 */
@RestController
@RequestMapping(value="order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value="queryOrderInfo")
    public Order queryOrderInfo(){
        return orderService.queryOrderInfo();
    }
}
