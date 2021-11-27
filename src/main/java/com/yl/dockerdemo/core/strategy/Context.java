package com.yl.dockerdemo.core.strategy;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 13:49
 */
public class Context {

    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
