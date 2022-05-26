package com.atguigu.gulimall.ware.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("gulimall-order")
public interface OrderFeignClient {
    
}
