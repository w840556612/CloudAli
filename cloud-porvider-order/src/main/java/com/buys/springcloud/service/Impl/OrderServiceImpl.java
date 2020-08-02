package com.buys.springcloud.service.Impl;

import com.buys.springcloud.service.OrderService;
import com.buys.springcloud.dao.OrderDao;
import com.buys.springcloud.entity.Order;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * wzy----15:20 2020/8/1 15:20
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderDao orderDao;

    public Order queryOrderInfo(){
        return orderDao.queryOrderInfo(1);
    }
}
