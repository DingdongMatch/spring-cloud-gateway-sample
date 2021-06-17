package com.match.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Predicate;

@SpringBootApplication
public class SpringCloudGatewaySampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudGatewaySampleApplication.class, args);
    }

    /**
     * 读取body断言需要注册bodyPredicate
     * @return true
     */
    @Bean
    public Predicate bodyPredicate() {
        return o -> true;
    }
}
