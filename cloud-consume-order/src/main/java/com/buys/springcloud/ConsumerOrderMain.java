package com.buys.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * wzy----17:48 2020/8/1 17:48
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerOrderMain {
    public static void main(String[] args) {
        System.out.println("消费者");
        SpringApplication.run(ConsumerOrderMain.class);
    }

}
