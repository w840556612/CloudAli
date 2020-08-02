package com.buys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * wzy----17:48 2020/8/1 17:48
 */
@SpringBootApplication
public class GateWayMain {
    public static void main(String[] args) {
        System.out.println("路由服务启动中.....");
        SpringApplication.run(GateWayMain.class);
    }

}
