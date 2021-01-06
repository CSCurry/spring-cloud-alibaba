package com.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class AlibabaNacosConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaNacosConfigClientApplication.class, args);
        log.info("AlibabaNacosConfigClientApplication启动完成");
    }
}
