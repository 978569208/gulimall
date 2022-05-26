package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.atguigu.gulimall.ware.dao")
public class GuliamllWareApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliamllWareApplication.class, args);
    }

}
