package com.example.web.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("alibaba-nacos-discovery-server") //指定这个接口所要调用的服务名称
public interface Client {

    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}