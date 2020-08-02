package com.buys.springcloud.config;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.UUID;

/**
 * wzy----10:56 2020/8/2 10:56
 */
@Configuration
@Slf4j
public class ApplicationContextConfig {
    @Bean
    @Order(-1)
    public GlobalFilter a() {
        return (exchange, chain) -> {
            /*MDC.put("logId", UUID.randomUUID().toString());*/
            log.info("first pre filter");
            List name=exchange.getRequest().getQueryParams().get("name");
            if(name==null){
                exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
                return exchange.getResponse().setComplete();
            }
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("third post filter");
            }));
        };
    }

    @Bean
    @Order(0)
    public GlobalFilter b() {
        return (exchange, chain) -> {
            log.info("second pre filter");
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                log.info("second post filter");
            }));
        };
    }
}
