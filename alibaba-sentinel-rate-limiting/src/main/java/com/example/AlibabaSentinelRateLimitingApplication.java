package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AlibabaSentinelRateLimitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaSentinelRateLimitingApplication.class, args);
        log.info("AlibabaSentinelRateLimitingApplication启动完成");
    }
}
