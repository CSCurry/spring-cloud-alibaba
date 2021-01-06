package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@Slf4j
@EnableFeignClients //开启扫描Spring Cloud Feign客户端的功能
@SpringBootApplication
public class AlibabaNacosDiscoveryClientFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryClientFeignApplication.class, args);
        log.info("AlibabaNacosDiscoveryClientFeignApplication启动完成");
    }
}
