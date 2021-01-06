package com.example.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RefreshScope //动态刷新配置
@RestController
public class TestController {

    @Value("${name}")
    private String name;

    @GetMapping("/test")
    public String hello() {
        return name;
    }
}