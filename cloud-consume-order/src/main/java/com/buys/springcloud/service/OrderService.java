package com.buys.springcloud.service;

import com.buys.springcloud.entity.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * wzy----18:20 2020/8/1 18:20
 */
@Component
@FeignClient(value = "cloud-provider-order")
public interface OrderService {
    @RequestMapping("order/queryOrderInfo")
    public String queryOrderInfo();
}
