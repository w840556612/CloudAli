package com.buys.springcloud.controller.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * wzy----14:53 2020/8/2 14:53
 */
public class CommonFallback {

    public static String deal_testKey(String pp, Throwable exception){
        return "运行异常了！！"+exception.getMessage();
    }
}
