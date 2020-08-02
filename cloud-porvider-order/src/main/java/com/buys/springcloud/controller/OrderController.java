package com.buys.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.buys.springcloud.controller.exception.CommonFallback;
import com.buys.springcloud.controller.exception.CommonHandler;
import com.buys.springcloud.service.OrderService;
import com.buys.springcloud.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping(value="testKey")
    @SentinelResource(value="testKey0",blockHandlerClass = CommonHandler.class,blockHandler = "deal_testKey",
            fallbackClass = CommonFallback.class,fallback = "deal_testKey")
    public String testKey(String pp){
        int a=10/0;
        System.out.println(pp);
        return "ok";
    }

}
