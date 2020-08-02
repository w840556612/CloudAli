package com.buys.springcloud.controller;

import com.buys.springcloud.entity.Order;
import com.buys.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * wzy----18:02 2020/8/1 18:02
 */
@RestController
@RequestMapping("order")
public class ConsumerOrderController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    OrderService orderService;

    /**
     * 方法一
     * @return
     */
    @RequestMapping(value="queryOrderInfoForRestTemplate")
    public String queryOrderInfoForRestTemplate(){
        return restTemplate.getForObject("http://127.0.0.1:8081/order/queryOrderInfo",String.class);
    }

    /**
     * 方法二 openFeign
     * @return
     */
    @RequestMapping(value="queryOrderInfo")
    public String queryOrderInfo(){
        return orderService.queryOrderInfo();
    }
}
