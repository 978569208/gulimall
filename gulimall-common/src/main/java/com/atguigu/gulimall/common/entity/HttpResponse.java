package com.atguigu.gulimall.common.entity;

import com.atguigu.gulimall.common.annotation.ColumnDesc;
import com.atguigu.gulimall.common.constantEnum.HttpResponseEnum;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Description TODO
 * @Author hukl
 * @Date 11:17 2022/5/26
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
public class HttpResponse<T> implements Serializable {

    @ColumnDesc(desc = "返回状态码")
    private String code = HttpResponseEnum.SUCCESS.getCode();

    @ColumnDesc(desc = "返回数据")
    private T data;

    @ColumnDesc(desc = "返回的信息")
    private String message = HttpResponseEnum.SUCCESS.getMessage();

    @ColumnDesc(desc = "响应的时间戳")
    private String timestamp = LocalDateTime.now().toString();

    private HttpResponse(T data) {
        this.data = data;
    }

    public static HttpResponse success(Object data) {
        return new HttpResponse(data);
    }


    public static HttpResponse success() {
        HttpResponse response = new HttpResponse();
        return response;
    }

    public static HttpResponse failure(String message) {
        final HttpResponse httpResponse = new HttpResponse();
        httpResponse.setCode(HttpResponseEnum.FAILED.getCode());
        httpResponse.setMessage(message);
        return httpResponse;
    }

    public static HttpResponse failure() {
        HttpResponse response = new HttpResponse();
        response.setCode(HttpResponseEnum.FAILED.getCode());
        response.setMessage(HttpResponseEnum.FAILED.getMessage());
        return response;
    }


    public boolean isSuccess() {
        if (this.getCode() == HttpResponseEnum.SUCCESS.getCode() || this.getCode() == HttpResponseEnum.API_SUCCESS.getCode()) {
            return true;
        }

        return false;
    }

}
