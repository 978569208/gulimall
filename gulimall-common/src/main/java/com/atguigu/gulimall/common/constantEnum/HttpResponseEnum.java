package com.atguigu.gulimall.common.constantEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum HttpResponseEnum {
    API_SUCCESS("200", "接口操作成功"),
    SUCCESS("0", "操作成功"),
    FAILED("1", "操作失败");

    private String code;
    private String message;
}
