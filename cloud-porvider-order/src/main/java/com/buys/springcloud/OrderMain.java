package com.buys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * wzy----14:34 2020/8/1 14:34
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class);
    }
}
