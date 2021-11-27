package com.yl.dockerdemo.common.exceptions;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 14:21
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message, Throwable throwable) {
        super(message,throwable);
    }
}
