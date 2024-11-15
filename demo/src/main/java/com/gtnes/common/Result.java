package com.gtnes.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther: Hades
 * @Date: 2023/9/25
 * @Description: Test
 * @PROJECT_NAME: new-test
 * @Package_name: IntelliJ IDEA
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    /**
     * 是否成功
     **/
    private Boolean success;
    /**
     * 错误信息
     **/
    private String message;
    /**
     * 请求状态 200-成功 400-失败
     **/
    private Integer code;
    /**
     * 当前时间戳
     **/
    private Long timestamp;
    /**
     * 返回结果
     **/
    private Object data;

    public static Result ok() {

        return new Result(true, null, 200, System.currentTimeMillis(), null);
    }

    public static Result ok(Object data) {

        return new Result(true, null, 200, System.currentTimeMillis(), data);
    }

    public static Result ok(List<?> data) {

        return new Result(true, null, 200, System.currentTimeMillis(), data);
    }

    public static Result fail(String errorMsg) {
        return new Result(false, errorMsg, 400, System.currentTimeMillis(), null);
    }
}

