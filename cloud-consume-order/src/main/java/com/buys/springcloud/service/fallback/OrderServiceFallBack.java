package com.buys.springcloud.service.fallback;

import com.buys.springcloud.service.OrderService;
import org.springframework.stereotype.Component;

/**
 * wzy----14:30 2020/8/2 14:30
 */
@Component
public class OrderServiceFallBack implements OrderService {
    public String queryOrderInfo() {
        return "这是openfegin的失败兜底方法";
    }
}
