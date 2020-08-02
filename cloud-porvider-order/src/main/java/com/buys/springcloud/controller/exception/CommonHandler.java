package com.buys.springcloud.controller.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * wzy----14:53 2020/8/2 14:53
 */
public class CommonHandler {

    public static String deal_testKey(String pp, BlockException exception){
        return "你错了！！";
    }


}
