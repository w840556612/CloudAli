package com.buys.springcloud.dao;

import com.buys.springcloud.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * wzy----15:12 2020/8/1 15:12
 */
@Mapper
public interface OrderDao {
    public Order queryOrderInfo(int id);
}
