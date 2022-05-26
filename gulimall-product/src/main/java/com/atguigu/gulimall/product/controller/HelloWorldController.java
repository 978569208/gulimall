package com.atguigu.gulimall.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description TODO
 * @Author hukl
 * @Date 15:01 2022/5/26
 * @Version 1.0
 **/

@RestController
@RequestMapping(value = "/hello")
@RefreshScope
public class HelloWorldController {

    @Value(value = "${hello-user.name}")
    private String name;

    @RequestMapping(value = "/hello")
    public String hello() {


        return "hello" + name;
    }
}
