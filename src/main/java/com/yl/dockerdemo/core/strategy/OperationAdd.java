package com.yl.dockerdemo.core.strategy;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 13:48
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
