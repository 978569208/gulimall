package com.atguigu.gulimall.ware.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("gulimall-product")
public interface ProductFeignClient {
    
}
