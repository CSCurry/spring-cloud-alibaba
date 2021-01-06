package com.example.web.controller;

import com.example.web.client.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class TestController {

    @Resource
    Client client;

    @GetMapping("/test")
    public String test() {
        return client.hello("Curry");
    }
}