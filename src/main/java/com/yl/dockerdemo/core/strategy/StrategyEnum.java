package com.yl.dockerdemo.core.strategy;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 14:27
 */
public enum StrategyEnum {

    ADD(OperationAdd.class.getName()),
    SUBTRACT(OperationSubtract.class.getName()),
    ;
    private final String className;

    StrategyEnum(String className) {
        this.className = className;
    }

    public String getClassName() {
        return className;
    }
}
