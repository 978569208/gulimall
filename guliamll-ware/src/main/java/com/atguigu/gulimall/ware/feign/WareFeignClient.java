package com.atguigu.gulimall.ware.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("gulimall-ware")
public interface WareFeignClient {
    
}
