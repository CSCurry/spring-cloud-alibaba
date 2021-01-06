package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@Slf4j
@EnableDiscoveryClient //开启Spring Cloud的服务注册与发现
@SpringBootApplication
public class AlibabaNacosDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosDiscoveryServerApplication.class, args);
        log.info("AlibabaNacosDiscoveryServerApplication启动完成");
    }
}
